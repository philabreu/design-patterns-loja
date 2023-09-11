package org.example;

import org.example.state.Player;
import org.example.state.UI;

public class DemoState {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
