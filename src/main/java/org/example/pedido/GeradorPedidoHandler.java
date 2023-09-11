package org.example.pedido;

import org.example.orcamento.Orcamento;

import java.time.LocalDateTime;
import java.util.List;

public class GeradorPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    public GeradorPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void executar(GeradorPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(acao -> acao.executarAcao(pedido));
    }
}
