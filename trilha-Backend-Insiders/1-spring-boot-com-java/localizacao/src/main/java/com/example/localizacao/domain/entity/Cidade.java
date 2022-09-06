package com.example.localizacao.domain.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tb_cidade")
@Data
public class Cidade {

    @Id
    @Column(name = "id_cidade")
    private Long id;
    @Column(name = "nome", length = 50)
    private String nome;
    @Column(name = "qtd_habitantes")
    private Long habitantes;

}