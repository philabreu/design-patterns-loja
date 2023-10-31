package org.example.factory_method;

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onclick();
    }

    @Override
    public void onclick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}