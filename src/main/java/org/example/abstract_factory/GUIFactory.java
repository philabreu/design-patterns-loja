package org.example.abstract_factory;

/**
 * A fábrica abstrata conhece todos os tipos de produtos (abstratos).
 */
public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
