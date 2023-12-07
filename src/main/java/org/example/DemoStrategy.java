package org.example;

import org.example.strategy.Order;
import org.example.strategy.PayByCreditCard;
import org.example.strategy.PayByPayPal;
import org.example.strategy.PayStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.isNull;

public class DemoStrategy {
    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static PayStrategy payStrategy;

    static {
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
    }

    public static void main(String[] args) throws IOException {
        while (!order.isClosed()) {
            int cost;

            String continueChoice;
            do {
                System.out.print("""
                        Por favor, escolha um produto:
                        1 - Mother board
                        2 - CPU
                        3 - HDD
                        4 - Memory
                        """);

                int choice = Integer.parseInt(reader.readLine());
                cost = priceOnProducts.get(choice);
                System.out.println("quantidade: ");
                int count = Integer.parseInt(reader.readLine());
                order.setTotalCost(cost * count);
                System.out.println("quer continuar escolhendo produtos? Y/N");
                continueChoice = reader.readLine();
            } while (continueChoice.equalsIgnoreCase("Y"));

            if (isNull(payStrategy)) {
                System.out.println("""
                        Please, select a payment method:
                        1 - PalPay
                        2 - Credit Card""");
                String paymentMethod = reader.readLine();

                if (paymentMethod.equals("1")) {
                    payStrategy = new PayByPayPal();
                } else {
                    payStrategy = new PayByCreditCard();
                }
            }

            order.processOrder(payStrategy);

            System.out.println("Pagar" + order.getTotalCost() + "itens ou continuar comprando? (P/C): ");
            String proceed = reader.readLine();

            if (proceed.equalsIgnoreCase("P")) {
                if (payStrategy.pay(order.getTotalCost())) {
                    System.out.println("pagamento feito com sucesso!");
                } else {
                    System.out.println("ERRO! Por favor, confira seus dados.");
                }
                order.setClosed();
            }

        }
    }
}
