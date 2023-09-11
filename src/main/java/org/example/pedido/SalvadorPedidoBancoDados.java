package org.example.pedido;

public class SalvadorPedidoBancoDados implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido) {
        System.out.println("salvando pedido no banco de dados.");
    }

}