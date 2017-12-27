package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int i = 0;
        float sum = 0.0f;
        while(n != -1){
            n = sc.nextInt();
            if (n != -1) sum = sum + n;
            if (n == -1) sum = sum / i;
            i++;
        }

        System.out.println(sum);

        //напишите тут ваш код
    }


}

