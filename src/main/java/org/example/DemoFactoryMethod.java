package org.example;

import org.example.factory_method.Dialog;
import org.example.factory_method.HtmlDialog;
import org.example.factory_method.WindowsDialog;

public class DemoFactoryMethod {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        run();
    }

    /**
     * A fábrica concreta geralmente é escolhida dependendo das opções de configuração ou ambiente.
     */
    static void configure() {
        if (System.getProperty("os.name").equalsIgnoreCase("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * Totalmente, código do cliente deve funcionar com fábricas e produtos por meio de interfaces abstratas.
     * Dessa forma, não se importa com qual fábrica trabalha e que tipo de produto devolve.
     */
    static void run() {
        dialog.renderWindow();
    }
}
