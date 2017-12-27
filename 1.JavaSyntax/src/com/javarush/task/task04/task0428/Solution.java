package com.javarush.task.task04.task0428;

/* 
Положительное число
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

            if (num1 > 0 && num2 > 0 && num3 > 0) System.out.println("3");
            else if ((num1 > 0 && num2 > 0) || (num2 > 0 && num3 > 0) || (num1 > 0 && num3 > 0)) System.out.println("2");
            else if (num1 > 0 || num2 > 0 || num3 > 0) System.out.println("1");
            else System.out.println("0");




        //напишите тут ваш код

    }
}
