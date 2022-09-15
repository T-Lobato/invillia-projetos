package com.mercadolivro.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name = "customer")
data class CustomerModel(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column
    var name: String,

    @Column
    var email: String
)