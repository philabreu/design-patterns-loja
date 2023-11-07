package org.example.abstract_factory;

/**
 * Abstract Factory assume que você tem várias famílias de produtos estruturadas em hierarquias de
 * classes separadas (Botão/Caixa de seleção). Todos os produtos da mesma família possuem uma interface comum.
 * Esta é a interface comum para a família de botões.
 */
public interface Button {
    void paint();
}