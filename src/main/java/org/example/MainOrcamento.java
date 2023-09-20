package org.example;

import org.example.orcamento.ItemOrcamento;
import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class MainOrcamento {
    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        antigo.reprovar();

        Orcamento novo = new Orcamento();
        novo.adicionarItem(new ItemOrcamento(new BigDecimal("600")));
        novo.adicionarItem(antigo);

        System.out.println("novo orcamento: "+novo.getValor());
    }
}
