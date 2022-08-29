package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "endereco_clientes")
public class EnderecoCliente {

    @Id
    private Cliente clienteId;
    private String rua;
    private String bairro;




}
