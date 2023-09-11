package org.example.orcamento;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class Orcamento {

    @Getter
    private BigDecimal valor;

    @Getter
    private int quantidadeItens;

    @Getter
    @Setter
    private SituacaoOrcamento situacaoOrcamento;

    public void aplicarDescontoExtra() {
        BigDecimal valorDescontoExtra = this.situacaoOrcamento.calcularDescontoExtra(this);
        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    public void aprovar() {
        this.situacaoOrcamento.aprovar(this);
    }

    public void reprovar() {
        this.situacaoOrcamento.reprovar(this);
    }

    public void finalizar() {
        this.situacaoOrcamento.finalizar(this);
    }

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacaoOrcamento = new EmAnalise();
    }
}
