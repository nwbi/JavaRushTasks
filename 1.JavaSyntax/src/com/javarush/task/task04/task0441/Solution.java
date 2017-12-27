package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 == num2 && num2 == num3) {
            System.out.println(num1);
            return;
        }

        if(num1 == num2 || num1 == num3) {
            System.out.println(num1);
            return;
        }
        else if(num2 == num3)
        {
            System.out.println(num2);
            return;
        }

        System.out.println(mid(num1, num2, num3));//напишите тут ваш код
    }

    static int mid(int a,int b, int c){
        if(( a >= b && a <= c) || (a <= b && a >= c)) return a;
        else return(mid(b,c,a));
    }
}
