package org.example.cor;

import static java.util.Objects.isNull;

public abstract class Middleware {

    private Middleware next;

    //Constrói cadeias de objetos de middleware.
    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;

        for (Middleware nextInChain : chain) {
            head.next = nextInChain;
            head = nextInChain;
        }

        return first;
    }

    /**
     * As subclasses implementarão esse método com verificações concretas.
     */
    public abstract boolean check(String email, String password);

    /**
     * Executa a verificação no próximo objeto da cadeia ou termina a travessia se estivermos em último objeto na cadeia.
     */
    protected boolean checkNext(String email, String password) {
        if (isNull(next)) {
            return true;
        }

        return next.check(email, password);
    }
}
