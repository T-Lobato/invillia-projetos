package org.example.service;

import org.example.domain.entity.Pedido;
import org.example.domain.enums.StatusPedido;
import org.example.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar( PedidoDTO dto );

    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizarStatus(Integer id, StatusPedido statusPedido);
}