package org.example;

import org.example.singleton.Singleton;

public class DemoSingleton {

    public static void main(String[] args) {
        System.out.println("""
                Se você vir o mesmo valor, então o singleton foi reutilizado (yeah!)
                Se você vir valores diferentes, então 2 singletons foram criados (droga!!)

                RESULTADO:
                """);

        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}
