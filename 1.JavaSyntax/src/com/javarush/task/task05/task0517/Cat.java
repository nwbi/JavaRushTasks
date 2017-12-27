package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat(String name){
        this.name = name;
        this.age = 1;
        this.weight = 3;
        this.color = "белый";
    }

    public Cat(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "белый";
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 4;
        this.color = "белый";
    }

    public Cat(int weight, String color){
        this.age = 2;
        this.weight = weight;
        this.color = color;
    }

    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.age = 5;
        this.address = address;
    }

    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
