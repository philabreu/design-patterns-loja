package org.example.cor;

public class RoleCheckMiddleware extends Middleware {
    @Override
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Olá admin!");
            return true;
        }
        System.out.println("Olá usuário!");

        return checkNext(email, password);
    }
}
