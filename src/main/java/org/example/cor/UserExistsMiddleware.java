package org.example.cor;

public class UserExistsMiddleware extends Middleware {
    private Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("email não cadastrado.");
            return false;
        }

        if (!server.isValidPassword(email, password)) {
            System.out.println("password incorreta.");
            return false;
        }
        return checkNext(email, password);
    }
}