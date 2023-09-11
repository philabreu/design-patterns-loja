package org.example.desconto;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximoDesconto;

    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);

    public abstract boolean deveAplicar(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento) {
        if (deveAplicar(orcamento)) {
            return efetuarCalculo(orcamento);
        }
        return proximoDesconto.calcular(orcamento);
    }

    public Desconto(Desconto proximoDesconto) {
        this.proximoDesconto = proximoDesconto;
    }
}
