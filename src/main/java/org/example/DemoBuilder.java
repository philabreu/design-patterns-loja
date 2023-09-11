package org.example;

import org.example.builder.*;

public class DemoBuilder {
    public static void main(String[] args) {
        Director director = new Director();

        /**
         * O Director obtém o objeto construtor concreto do cliente (código do aplicativo). Isso porque o aplicativo
         * sabe melhor qual construtor usar para obter um produto específico.
         */
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);


        /**
         * O produto final geralmente é recuperado de um objeto construtor, pois o Diretor não está ciente e não
         * depende de construtores e produtos concretos.
         */
        Car car = carBuilder.getResult();
        System.out.println("construido:\n " + car.getCarType());

        CarManualBuilder carManualBuilder = new CarManualBuilder();

        /**
         * O Diretor pode conhecer diversas receitas de construção.
         */
        director.constructSportsCar(carManualBuilder);
        Manual carManual = carManualBuilder.getResult();
        System.out.println("construido:\n " + carManual.print());
    }
}
