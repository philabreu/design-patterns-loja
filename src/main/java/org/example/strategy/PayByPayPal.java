package org.example.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PayByPayPal implements PayStrategy {
    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    static {
        DATA_BASE.put("123", "bezzerra.filipe@gmail.com");
    }

    @Override
    public void collectPaymentDetails() {
        try {
            while (!signedIn) {
                System.out.println("digite email do usuario: ");
                email = READER.readLine();
                System.out.println("digite senha: ");
                password = READER.readLine();

                if (verify()) {
                    System.out.println("dados verificados com sucesso!");
                } else {
                    System.out.println("dados invalidos.");
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private boolean verify() {
        setSignedIn(email.equals(DATA_BASE.get(password)));
        return signedIn;
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (signedIn) {
            System.out.println("pagando " + paymentAmount + "usando paypal.");
            return true;
        } else {
            return false;
        }
    }

    private void setSignedIn(boolean equals) {
        this.signedIn = signedIn;
    }


}
