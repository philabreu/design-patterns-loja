package org.example;

import org.example.desconto.CalculadoraDescontos;
import org.example.imposto.CalculadoraImpostos;
import org.example.imposto.ICMS;
import org.example.imposto.ISS;
import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class MainDescontos {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(new BigDecimal("200"), 8);
        Orcamento segundo = new Orcamento(new BigDecimal("900"), 1);

        CalculadoraDescontos calculadora = new CalculadoraDescontos();

        System.out.println("valor do primeiro orcamento: " + calculadora.calcular(primeiro));
        System.out.println("valor do segundo orcamento: " + calculadora.calcular(segundo));
    }
}
