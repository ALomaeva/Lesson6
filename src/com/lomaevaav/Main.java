package com.lomaevaav;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.run(200);
        cat1.jump(1);
        cat1.swim(1);
        Dog dog1 = new Dog();
        dog1.run(600);
        dog1.jump(0.7F);
        dog1.swim(15);

    }
}
