package org.example;

import org.example.cor.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoCor {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        Middleware middleware = Middleware.link(
                new ThrottlingMiddleware(2),
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware()
        );

        /**
         * Todas as verificações estão vinculadas. O cliente pode construir várias cadeias usando
         * os mesmos componentes.
         */
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean sucess;
        do {
            System.out.println("digite o email: ");
            String email = reader.readLine();
            System.out.println("digite a password: ");
            String password = reader.readLine();
            sucess = server.login(email, password);
        } while (!sucess);
    }
}
