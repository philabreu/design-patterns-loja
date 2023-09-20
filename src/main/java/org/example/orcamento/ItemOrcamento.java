package org.example.orcamento;

import lombok.Getter;

import java.math.BigDecimal;

public class ItemOrcamento implements Orcavel {

    @Getter
    private BigDecimal valor;

    public ItemOrcamento(BigDecimal valor) {
        this.valor = valor;
    }
}