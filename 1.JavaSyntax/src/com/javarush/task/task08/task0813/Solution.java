package com.javarush.task.task08.task0813;

import java.util.Set;
import java.util.HashSet;

/* 
20 слов на букву «Л»
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только два метода.
4. Метод createSet() должен создавать и возвращать множество (реализация HashSet).
5. Множество из метода createSet() должно содержать 20 слов на букву «Л».
*/

public class Solution {
    public static Set<String> createSet() {
        HashSet<String> list = new HashSet<>();
        list.add("Лес");
        list.add("Лис");
        list.add("Лесник");
        list.add("Лесной");
        list.add("Лисичка");
        list.add("Люлюка");
        list.add("Лесоруб");
        list.add("Ледник");
        list.add("Люлька");
        list.add("Ловкач");
        list.add("Людка");
        list.add("Лавстори");
        list.add("Луна");
        list.add("Лунатик");
        list.add("Ломовой");
        list.add("Лом");
        list.add("Ломать");
        list.add("Лабрикен");
        list.add("Левимицин");
        list.add("Лекарство");

        return list;

    }

    public static void main(String[] args) {

    }
}
