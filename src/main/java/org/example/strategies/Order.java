package org.example.strategies;

import lombok.Getter;
import lombok.Setter;

public class Order {

    @Getter
    private int totalCost = 0;

    private boolean isClosed = false;

    public void processOrder(PayStrategy payStrategy){
        payStrategy.collectPaymentDetails();
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}
