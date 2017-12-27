package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int sum = 0;

        while(num != -1){
            num = sc.nextInt();
            sum = sum + num;
            if (num == -1) {
                System.out.println(sum);
                break;
                }
            }
        }
        //напишите тут ваш код

}
