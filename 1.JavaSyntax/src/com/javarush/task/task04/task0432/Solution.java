package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        int num = sc.nextInt();

        while (num > 0)
        {
            num = num - 1;
            System.out.println(text);
        }
        //напишите тут ваш код

    }
}
