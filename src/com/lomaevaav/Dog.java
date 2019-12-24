package com.lomaevaav;

public class Dog extends Animal{
    public void run(float r) {
        if (r<=500)
            System.out.println("Пес пробежал " + r + " м");
        else
            System.out.println("Пес не может пробежать " + r + " м");
    }
    public void jump(float j) {
        if (j<=0.5)
            System.out.println("Пес подпрыгнул на "+ j +" м");
        else
            System.out.println("Пес не может подпрыгнуть " + j + " м");
    }
    public void swim(float s) {
        if (s<=10)
            System.out.println("Пес проплыл " + s + " м");
        else
            System.out.println("Пес не может проплыть " + s + " м");
    }

}
