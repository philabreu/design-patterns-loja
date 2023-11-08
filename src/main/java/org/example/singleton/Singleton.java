package org.example.singleton;


import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public final class Singleton {
    /**
     * O campo deve ser declarado volátil para que o bloqueio de verificação dupla funcione corretamente.
     */
    private static volatile Singleton instance;

    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        /*
          A abordagem adotada aqui é chamada de bloqueio de verificação dupla (DCL). Isto existe para evitar condições
          de corrida entre múltiplos threads que podem tenta obter uma instância singleton ao mesmo tempo, criando
          uma instância separada como resultado.
          Pode parecer que ter a variável `result` aqui é completamente sem sentido. Há, no entanto, uma advertência
          muito importante quando implementando bloqueio de verificação dupla em Java, que é resolvido pela
          introdução desta variável local.
         */
        Singleton result = instance;
        if (nonNull(result)) {
            return result;
        }

        synchronized (Singleton.class) {
            if (isNull(instance)) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }


}
