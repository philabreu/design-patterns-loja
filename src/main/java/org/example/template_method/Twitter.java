package org.example.template_method;

public class Twitter extends Network {
    public Twitter(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String username, String password) {
        System.out.println("\n checando parametros de usuario");
        System.out.println("Name: " + this.username);
        System.out.println("Password: ");
        for (int i = 0; i < this.password.length(); i++) {
            System.out.print("*");
        }
        simulateNetworkLatency();
        System.out.println("\n\nLogado no Twitter com sucesso!");

        return true;
    }


    @Override
    public boolean sendData(byte[] data) {
        boolean messagePosted = true;
        if (messagePosted) {
            System.out.println("Mensagem: '" + new String(data) + "'foi postada no twitter");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void logout() {
        System.out.println("Usuario: '" + username + "'fez logout do twitter");
    }

    private void simulateNetworkLatency() {
        try {
            int i = 0;
            System.out.println();
            while (i < 10) {
                System.out.println(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
