package org.example.pedido;

import lombok.Getter;
import org.example.orcamento.Orcamento;

import java.time.LocalDateTime;

public class Pedido {
    @Getter
    private String cliente;

    @Getter
    private LocalDateTime data;

    @Getter
    private Orcamento orcamento;

    public Pedido(String cliente, LocalDateTime data, Orcamento orcamento) {
        this.cliente = cliente;
        this.data = data;
        this.orcamento = orcamento;
    }

}
