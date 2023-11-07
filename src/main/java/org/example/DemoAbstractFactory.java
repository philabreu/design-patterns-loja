package org.example;

import org.example.abstract_factory.Application;
import org.example.abstract_factory.GUIFactory;
import org.example.abstract_factory.MacOSFactory;
import org.example.abstract_factory.WindowsFactory;

public class DemoAbstractFactory {

    public static void main(String[] args) {
        Application application = configure();
        application.paint();
    }


    /**
     * O aplicativo escolhe o tipo de fábrica e o cria em tempo de execução (geralmente em
     * estágio de inicialização), dependendo da configuração ou ambiente variáveis.
     */
    private static Application configure() {
        Application application;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("linux")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }

        application = new Application(factory);

        return application;
    }
}