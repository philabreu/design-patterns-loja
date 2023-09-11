package org.example.pedido;

public class EnviadorEmailPedido implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido) {
        System.out.println("enviando email com dados do pedido.");
    }
}
