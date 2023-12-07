package org.example.imposto;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

import static java.util.Objects.nonNull;

public abstract class Imposto {
    private Imposto outroImposto;

    public Imposto(Imposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento) {
        BigDecimal valorImposto = realizarCalculo(orcamento);
        BigDecimal valorOutroImposto = BigDecimal.ZERO;
        if (nonNull(outroImposto)) {
            valorOutroImposto = outroImposto.realizarCalculo(orcamento);
        }

        return valorImposto.add(valorOutroImposto);
    }
}