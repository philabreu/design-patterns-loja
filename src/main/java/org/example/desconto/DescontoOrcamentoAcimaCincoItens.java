package org.example.desconto;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoAcimaCincoItens extends Desconto {

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getItens() > 5;
    }

    public DescontoOrcamentoAcimaCincoItens(Desconto proximoDesconto) {
        super(proximoDesconto);
    }

}
