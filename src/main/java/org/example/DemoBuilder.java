package org.example;

import org.example.builder.*;

public class DemoBuilder {
    public static void main(String[] args) {
        /**
         * O Director obtém o objeto construtor concreto do cliente (código do aplicativo). Isso porque o aplicativo
         * sabe melhor qual construtor usar para obter um produto específico.
         */
        CarBuilder carBuilder = new CarBuilder();
        Director.constructSportsCar(carBuilder);


        /**
         * O produto final geralmente é recuperado de um objeto construtor, pois o Diretor não está ciente e não
         * depende de construtores e produtos concretos.
         */
        System.out.println("construido:\n " + carBuilder.getResult().getCarType());
        CarManualBuilder carManualBuilder = new CarManualBuilder();


        /**
         * O Diretor pode conhecer diversas receitas de construção.
         */
        Director.constructSportsCar(carManualBuilder);
        System.out.println("construido:\n " + carManualBuilder.getResult().print());
    }
}
