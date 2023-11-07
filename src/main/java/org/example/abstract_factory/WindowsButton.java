package org.example.abstract_factory;

/**
 * Todas as famílias de produtos possuem as mesmas variedades (MacOS/Windows).
 * Esta é uma variante Windows de um botão.
 */
public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("você criou um botão de Windows");
    }
}
