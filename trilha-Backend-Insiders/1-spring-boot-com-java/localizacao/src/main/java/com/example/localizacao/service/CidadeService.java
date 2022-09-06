package com.example.localizacao.service;

import com.example.localizacao.domain.entity.Cidade;
import com.example.localizacao.domain.repository.CidadeRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

}