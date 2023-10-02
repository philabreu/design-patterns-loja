package org.example;

import org.example.orcamento.ItemOrcamento;
import org.example.orcamento.Orcamento;
import org.example.orcamento.OrcamentoProxy;

import java.math.BigDecimal;

public class DemoProxy {
    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        antigo.reprovar();

        Orcamento novo = new Orcamento();
        novo.adicionarItem(new ItemOrcamento(new BigDecimal("600")));
        novo.adicionarItem(antigo);

        OrcamentoProxy orcamentoProxy = new OrcamentoProxy(novo);

        System.out.println("novo orcamento: " + orcamentoProxy.getValor());
    }
}
