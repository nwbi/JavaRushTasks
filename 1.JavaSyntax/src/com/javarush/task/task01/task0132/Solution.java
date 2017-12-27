package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int a1 = (int)number/100;
        //System.out.println(a1);

        int a2 = (number - a1*100 - number%10)/10;
        //System.out.println(a2);

        int a3 = number%10;
        //System.out.println(a3);



        return (a1+a2+a3);
        //напишите тут ваш код
    }
}