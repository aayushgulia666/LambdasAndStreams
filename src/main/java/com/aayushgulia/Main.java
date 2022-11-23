package com.aayushgulia;

import java.util.Random;

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

        Calculator calculator = (int x, int y) -> {
            Random random = new Random();
            int randomNumber = random.nextInt(30);
            return x * y + randomNumber;
        };

        System.out.println(calculator.calculate(2, 4));
    }
}