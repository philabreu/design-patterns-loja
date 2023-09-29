package org.example;

import org.example.pedido.*;

import java.math.BigDecimal;
import java.util.Arrays;

public class MainPedidos {
    public static void main(String[] args) {
        String cliente = "Filipe";
        BigDecimal valorOrcamento = new BigDecimal("100");
        int quantidadeItens = 10;

        GeradorPedido geradorPedido = new GeradorPedido(cliente, valorOrcamento, quantidadeItens);
        GeradorPedidoHandler handler = new GeradorPedidoHandler(
                Arrays.asList(
                        new SalvadorPedidoBancoDados(),
                        new EnviadorEmailPedido(),
                        new LoggerPedido()
        ));
        handler.executar(geradorPedido);
    }
}
