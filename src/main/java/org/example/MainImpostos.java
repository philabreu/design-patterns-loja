package org.example;

import org.example.imposto.CalculadoraImpostos;
import org.example.imposto.ICMS;
import org.example.imposto.ISS;
import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class MainImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);

        CalculadoraImpostos calculadoraImpostos = new CalculadoraImpostos();

        System.out.println("Valor do ISS: " + calculadoraImpostos.calcular(orcamento, new ISS()));
        System.out.println("Valor do ICMS: " + calculadoraImpostos.calcular(orcamento, new ICMS()));
    }
}