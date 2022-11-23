package com.aayushgulia;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new HelloGreeting();
        greeting.sayHello();

        Greeting greeting1 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello World again!");
            }
        };
        greeting1.sayHello();

        Greeting greeting2 = () -> System.out.println("Hello world using lambda!");
        greeting2.sayHello();
    }
}