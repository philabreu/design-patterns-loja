package org.example.builder;

import lombok.Getter;

public class GPSNavigator {
    @Getter
    private String route;

    public GPSNavigator() {
        this.route = "Avenida Jurubatuba, número 288, São Paulo";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }
}
