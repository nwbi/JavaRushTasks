package com.javarush.task.task05.task0530;

import java.io.*;

/* 
Шеф, что-то не пашет
Задача: Программа вводит два числа с клавиатуры и выводит их сумму на экран.


Требования:
1. Программа должна считывать числа с клавиатуры.
2. В классе должен быть только один метод main.
3. Программа должна выводить строку, которая начинается на "Sum = ".
4. Программа должна выводить строку, которая заканчивается суммой введенных чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a, b, sum = 0;

        String sa = reader.readLine();
        String sb = reader.readLine();
        try{
            a = Integer.parseInt(sa);
            b = Integer.parseInt(sb);
            sum = a + b;
        } catch (NumberFormatException e) {

        }

        System.out.println("Sum = " + sum);
    }
}
