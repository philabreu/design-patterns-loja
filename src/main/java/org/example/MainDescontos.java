package org.example;

import org.example.desconto.CalculadoraDescontos;
import org.example.orcamento.ItemOrcamento;
import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class MainDescontos {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento();
        primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        Orcamento segundo = new Orcamento();
        segundo.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));
        Orcamento terceiro = new Orcamento();
        terceiro.adicionarItem(new ItemOrcamento(new BigDecimal("500")));

        CalculadoraDescontos calculadora = new CalculadoraDescontos();

        System.out.println("valor do primeiro orcamento: " + calculadora.calcular(primeiro));
        System.out.println("valor do segundo orcamento: " + calculadora.calcular(segundo));
        System.out.println("valor do terceiro orcamento: " + calculadora.calcular(terceiro));
    }
}
