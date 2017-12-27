package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        int num;

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if(num >= 1 && num <= 999)
        {

            if (num % 2 == 0 && num < 10)System.out.println("четное однозначное число");
            else if (num % 2 == 0 && num < 100 && num >= 10)System.out.println("четное двузначное число");
            else if (num % 2 == 0 && num >= 100)System.out.println("четное трехзначное число");
            if (!(num % 2 == 0) && num < 10)System.out.println("нечетное однозначное число");
            else if (!(num % 2 == 0) && num < 100 && num >= 10)System.out.println("нечетное двузначное число");
            else if (!(num % 2 == 0) && num >= 100)System.out.println("нечетное трехзначное число");

        }
        //напишите тут ваш код

    }
}
