package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        for(int i = 0; i < 10; i++)
        {
            if (i == 0) System.out.print(8);
            if (i == 1) for(int j = 0; j < 2; j ++) System.out.print(8);
            if (i == 2) for(int j = 0; j < 3; j ++) System.out.print(8);
            if (i == 3) for(int j = 0; j < 4; j ++) System.out.print(8);
            if (i == 4) for(int j = 0; j < 5; j ++) System.out.print(8);
            if (i == 5) for(int j = 0; j < 6; j ++) System.out.print(8);
            if (i == 6) for(int j = 0; j < 7; j ++) System.out.print(8);
            if (i == 7) for(int j = 0; j < 8; j ++) System.out.print(8);
            if (i == 8) for(int j = 0; j < 9; j ++) System.out.print(8);
            if (i == 9) for(int j = 0; j < 10; j ++) System.out.print(8);
            System.out.println("");
        }

        long s = 8;
        for (long count = 0; count < 10; count++)
        {
            System.out.println(s);
            s = s * 10 + 8;
        }

        //напишите тут ваш код

    }
}
