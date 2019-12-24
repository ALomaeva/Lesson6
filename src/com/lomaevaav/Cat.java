package com.lomaevaav;

public class Cat extends Animal {
    public void run(float r) {
        if (r<=200)
            System.out.println("Кот пробежал " + r + " м");
        else
            System.out.println("Кот не может пробежать " + r + " м");
    }
    public void jump(float j) {
        if (j<=2)
            System.out.println("Кот подпрыгнул на "+ j +" м");
        else
            System.out.println("Кот не может подпрыгнуть " + j + " м");
    }
    public void swim(float s) {
        System.out.println("Кот не умеет плавать");
    }

}
