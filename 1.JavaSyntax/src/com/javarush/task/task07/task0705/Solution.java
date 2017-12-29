package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.


Требования:
1. Программа должна создавать большой массив на 20 целых чисел.
2. Программа должна считывать с клавиатуры 20 чисел для большого массива.
3. Программа должна создавать два маленьких массив на 10 чисел каждый.
4. Программа должна скопировать одну половину большого массива в первый маленький, а второю - во второй и вывести его на экран.
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        int[] mass = new int[20];
        int[] mass1 = new int[10];
        int[] mass2 = new int[10];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < mass.length; i++) {
            mass[i] = sc.nextInt();
            if(i < 10) mass1[i] = mass[i];
            else mass2[i-10] = mass[i];
        }

        for (int i = 0; i < mass2.length; i++) {
            System.out.println(mass2[i]);
        }
        //напишите тут ваш код
    }
}
