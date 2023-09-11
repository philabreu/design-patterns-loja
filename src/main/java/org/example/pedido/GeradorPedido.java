package org.example.pedido;

import lombok.Getter;
import org.example.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeradorPedido {
    @Getter
    private String cliente;

    @Getter
    private BigDecimal valorOrcamento;

    @Getter
    private int quantidadeItens;

    public GeradorPedido(String cliente, BigDecimal valorOrcamento, int quantidadeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;
    }

    public void executa() {
        Orcamento orcamento = new Orcamento(this.valorOrcamento, this.quantidadeItens);

        Pedido pedido = new Pedido(cliente, LocalDateTime.now(), orcamento);
        System.out.println("salvar pedido no banco de dados.");
        System.out.println("enviar email com dados do novo pedido.");
    }


}
