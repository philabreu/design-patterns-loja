package org.example.desconto;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto cadeiaDescontos = new DescontoOrcamentoAcimaCincoItens(
                new DescontoOrcamentoValorAcimaQuinhentos(
                        new SemDesconto()
                )
        );

        return cadeiaDescontos.efetuarCalculo(orcamento);
    }
}