package org.example.abstract_factory;

/**
 * Os usuários da fábrica não se importam com qual fábrica de concreto eles usam, pois trabalham com
 * fábricas e produtos através de interfaces abstratas.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}