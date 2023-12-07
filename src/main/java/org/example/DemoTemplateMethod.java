package org.example;

import org.example.template_method.Facebook;
import org.example.template_method.Network;
import org.example.template_method.Twitter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoTemplateMethod {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;

        System.out.println("digite username: ");
        String username = reader.readLine();
        System.out.println("digite password: ");
        String password = reader.readLine();

        System.out.println("digite a mensagem: ");
        String message = reader.readLine();

        System.out.println("""

                Escolha rede social para postar.
                 1 - Facebook
                2 - Twitter""");
        int choice = Integer.parseInt(reader.readLine());

        if (choice == 1) {
            network = new Facebook(username, password);
        } else if (choice == 2) {
            network = new Twitter(username, password);
        }

        network.post(message);
    }
}
