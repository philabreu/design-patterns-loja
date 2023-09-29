package org.example.pedido;

public class LoggerPedido implements AcaoAposGerarPedido {
    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Pedido gerado com sucesso" + pedido);
    }
}
