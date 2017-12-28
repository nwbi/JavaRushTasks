package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
Текущая реализация: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.


Требования:
1. Программа должна считывать числа с клавиатуры.
2. В классе должен быть метод public static void main.
3. В классе должен быть метод public static min, принимающий 5 параметров типа int.
4. Метод min должен возвращать минимум из 5 переданных чисел.
5. Программа должна выводить строку, которая начинается на "Minimum = ".
6. Программа должна выводить строку, которая заканчивается минимальным из 5 введенных чисел.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        int num4 = Integer.parseInt(reader.readLine());
        int num5 = Integer.parseInt(reader.readLine());

        int minimum = min(num1, num2, num3, num4, num5);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e) {
        int m1, m2, m3, m4, m5;
        m1 = a < b ? a : b;
        m2 = m1 < c ? m1 : c;
        m3 = m2 < d ? m2 : d;
        m4 = m3 < e ? m3 : e;
        return m4;

    }
}
