package com.example.localizacao.service;

import com.example.localizacao.domain.entity.Cidade;
import com.example.localizacao.domain.repository.CidadeRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.example.localizacao.domain.repository.specs.CidadeSpecs.habitantesGreaterThan;
import static com.example.localizacao.domain.repository.specs.CidadeSpecs.nomeEqual;

@Service
public class CidadeService {

    private CidadeRepository repository;

    public CidadeService(CidadeRepository repository){
        this.repository = repository;
    }

    @Transactional
    void salvarCidade(){
        var cidade = new Cidade(1L, "São Paulo", 12396372L);
        repository.save(cidade);
    }

    public void listarCidadesPorQuantidadeHabitantes(){
        repository.findByHabitantesLessThanAndNomeLike(1000001L, "Br%").forEach(System.out::println);
    }

    public void listarCidadesPorNome(){
        Pageable pageable = PageRequest.of(0,10);
        repository
                .findByNomeLike("Porto%", pageable)
                .forEach(System.out::println);

    }

    public void listarCidadesPorHabitantes(){
        repository.findByHabitantes(78787900L).forEach(System.out::println);
    }

    void listarCidades(){
        repository.findAll().forEach(System.out::println);
    }

    public List<Cidade> filtroDinamico(Cidade cidade){
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.STARTING);
        Example<Cidade> example = Example.of(cidade, matcher);
       return repository.findAll(example);

    }

    public void listarCidadesByNomeSpecs(){
        repository
                .findAll(nomeEqual("São Paulo").or(habitantesGreaterThan(1000L)))
                .forEach(System.out::println);
    }

}