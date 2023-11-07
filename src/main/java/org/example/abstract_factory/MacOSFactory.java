package org.example.abstract_factory;

/**
 * Cada fábrica de concreto amplia a fábrica básica e é responsável pela criação
 * produtos de uma única variedade.
 */
public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
