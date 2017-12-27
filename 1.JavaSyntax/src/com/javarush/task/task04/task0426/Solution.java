package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        int a;
        boolean b;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = a % 2 == 0;

        if(a < 0 && b) System.out.println("отрицательное четное число");
        else if(a < 0 && !b) System.out.println("отрицательное нечетное число");
        else if(a == 0 && b) System.out.println("ноль");
        else if(a > 0 && b) System.out.println("положительное четное число");
        else if(a > 0 && !b) System.out.println("положительное нечетное число");
        //напишите тут ваш код
    }
}
