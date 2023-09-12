package org.example.orcamento;

import org.example.adapter.HttpAdapter;
import org.example.exception.DomainException;

import java.util.Map;

public class RegistroOrcamento {

    private HttpAdapter adapter;

    public RegistroOrcamento(HttpAdapter adapter) {
        this.adapter = adapter;
    }

    public void registrar(Orcamento orcamento) {
        if (!orcamento.isFinalizado()) {
            throw new DomainException("Orçamento não foi finalizado.");
        }

        adapter.post("http://api.external/orcamento", Map.of(
                        "valor", orcamento.getValor(),
                        "quantidadeItens", orcamento.getQuantidadeItens()
                )
        );
    }
}
