package com.example.localizacao.domain.repository;

import com.example.localizacao.domain.entity.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

    //Busca pelo nome correto
    List<Cidade> findByNome(String nome);

    //Busca pelo nome like
    @Query(" select c from Cidade c where upper(c.nome) like upper(?1) ")
    List<Cidade> findByNomeLike(String nome);

    // Busca pelo nome começando por aquele pedaço
    List<Cidade> findByNomeStartingWith(String nome);

    // Busca pelo nome terminando por aquele pedaço
    List<Cidade> findByNomeEndingWith(String nome);

    // Busca pelo nome contendo aquele pedaço
    List<Cidade> findByNomeContaining(String nome);


    List<Cidade> findByHabitantes(Long habitantes);

    List<Cidade> findByHabitantesLessThan(Long habitantes);

    List<Cidade> findByHabitantesGreaterThan(Long habitantes);

    List<Cidade> findByHabitantesLessThanEqual(Long habitantes);

    List<Cidade> findByHabitantesLessThanAndNomeLike(Long habitantes, String nome);







}
