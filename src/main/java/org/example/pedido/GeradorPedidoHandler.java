package org.example.pedido;

import org.example.orcamento.ItemOrcamento;
import org.example.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class GeradorPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    public GeradorPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void executar(GeradorPedido dados) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        this.acoes.forEach(acao -> acao.executarAcao(pedido));
    }
}
