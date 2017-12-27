package com.javarush.task.task05.task0509;

/* 
Создать класс Friend
*/

public class Friend {

    String name;
    int age;
    char sex;

    public void initialize(String name)
    {
        this.name = name;
    }

    public void initialize(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void initialize(String name, int age, char sex)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

//5. У класса должен быть метод initialize, принимающий в качестве параметра имя и инициализирующий соответствующую переменную класса.
//6. У класса должен быть метод initialize, принимающий в качестве параметров имя, возраст и инициализирующий соответствующие переменные класса.
//7. У класса должен быть метод initialize, принимающий в качестве параметров имя, возраст, пол и инициализирующий соответствующие переменные класса.
    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
