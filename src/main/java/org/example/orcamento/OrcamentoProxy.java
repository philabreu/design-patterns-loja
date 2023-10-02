package org.example.orcamento;

import java.math.BigDecimal;

import static java.util.Objects.isNull;

public class OrcamentoProxy extends Orcamento {
    private BigDecimal valor;
    private Orcamento orcamento;

    public OrcamentoProxy(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    @Override
    public BigDecimal getValor() {
        if (isNull(valor)) {
            this.valor = orcamento.getValor();
        }

        return this.valor;
    }
}
