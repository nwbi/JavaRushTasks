package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    int top, left, width, height;

    public Rectangle(int top){
        //ширина/высота не задана (оба равны 0)
        this.top = top;
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(int top, int left){
        //ширина/высота не задана (оба равны 0)
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(int top, int left, int width){
        //высота не задана (равно ширине) создаём квадрат
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    public Rectangle(int top, int left, int width, int height){
        //заданы 4 параметра: верхняя координата, левая, ширина и высота
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public  Rectangle(Rectangle anoth) {
        //создаём копию другого прямоугольника (он и передаётся в параметрах)
        this.left = anoth.left;
        this.top = anoth.top;
        this.width = anoth.width;
        this.height  =anoth.height;
    }

    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
