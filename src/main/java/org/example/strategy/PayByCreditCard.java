package org.example.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByCreditCard implements PayStrategy {
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;

    @Override
    public void collectPaymentDetails() {
        try {
            System.out.println("digite numero do cartão: ");
            String number = READER.readLine();
            System.out.println("digite a data de expiração do cartão (mm/yy): ");
            String date = READER.readLine();
            System.out.println("digite o cvv: ");
            String cvv = READER.readLine();
            card = new CreditCard(number, date, cvv);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("pagando " + paymentAmount + "usando cartão de credito.");
            card.setAmount(card.getAmount() - paymentAmount);

            return true;
        } else {
            return false;
        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }
}