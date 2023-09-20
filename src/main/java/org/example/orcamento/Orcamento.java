package org.example.orcamento;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento implements Orcavel {
    @Getter
    private BigDecimal valor;

    @Getter
    @Setter
    private SituacaoOrcamento situacaoOrcamento;

    private List<Orcavel> itens;

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

    public Orcamento() {
        this.valor = BigDecimal.ZERO;
        this.itens = new ArrayList<>();
        this.situacaoOrcamento = new EmAnalise();
    }

    public boolean isFinalizado() {
        return situacaoOrcamento instanceof Finalizado;
    }

    public int getItens() {
        return itens.size();
    }

    public void adicionarItem(Orcavel item) {
        this.valor = valor.add(item.getValor());
        this.itens.add(item);
    }
}