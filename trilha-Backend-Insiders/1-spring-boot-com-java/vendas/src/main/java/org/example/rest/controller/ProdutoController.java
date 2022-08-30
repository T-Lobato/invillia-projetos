package org.example.rest.controller;

import org.example.domain.entity.Produto;
import org.example.domain.repository.Produtos;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import static org.springframework.http.HttpStatus.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private Produtos repository;

    public ProdutoController(Produtos repository) {
        this.repository = repository;
    }

    @GetMapping("{id}")
    public Produto getById ( @PathVariable Integer id ){
        return repository
                .findById(id)
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND,
                                "Produto não encontrado"));
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public Produto save( @RequestBody Produto produto ){
        return repository.save(produto);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(NO_CONTENT)
    public void delete( @PathVariable Integer id ){
        repository.findById(id)
                .map( produto -> {
                    repository.delete(produto);
                    return produto;
                })
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND,
                        "Produto não encontrado"));
    }

    @PutMapping("{id}")
    @ResponseStatus(NO_CONTENT)
    public void update( @PathVariable Integer id,
                                @RequestBody Produto produto){
        repository
                .findById(id)
                .map( produtoExistente -> {
                    produto.setId(produtoExistente.getId());
                    repository.save(produto);
                    return produtoExistente;
                }).orElseThrow( () -> new ResponseStatusException(NOT_FOUND,
                        "Produto não encontrado"));
    }

    @GetMapping
    public List<Produto> find(Produto filtro){
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(
                        ExampleMatcher.StringMatcher.CONTAINING );

        Example example = Example.of(filtro, matcher);
        return repository.findAll(example);
    }

}