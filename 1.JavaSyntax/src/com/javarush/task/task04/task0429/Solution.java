package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        int num1, num2, num3;

        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        int plus = 0, min = 0;

        if(num1 > 0) plus++;
        if(num2 > 0) plus++;
        if(num3 > 0) plus++;

        if(num1 < 0) min++;
        if(num2 < 0) min++;
        if(num3 < 0) min++;

        System.out.println("количество отрицательных чисел: " + min);
        System.out.println("количество положительных чисел: " + plus);


        //напишите тут ваш код

    }
}
