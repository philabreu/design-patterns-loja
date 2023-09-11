package org.example.template_method;

public abstract class Network {
    String username;
    String password;

    Network() {

    }

    /**
     * Publique os dados em qualquer rede.
     */
    public boolean post(String message) {
        /**
         * Autentique antes de postar. Cada rede usa um método de autenticação diferente.
         */
        if (login(this.username, this.password)) {
            /**
             * Envie os dados da postagem.
             */
            boolean result = sendData(message.getBytes());
            logout();
            return result;
        }
        return false;
    }

    abstract boolean login(String userName, String password);

    abstract boolean sendData(byte[] data);

    abstract void logout();


}
