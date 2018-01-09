package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Выражаемся покороче
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 5 строк с клавиатуры и записывать их в список.
3. Программа должна выводить самую короткую строку на экран.
4. Если есть несколько строк с длиной равной минимальной, то нужно вывести каждую из них с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
       // Scanner scantext = new Scanner(System.in);

       // List<String> strings = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>(); //прошла валидацию
       // String s1 = "\n";
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            /*if(s.equals(s1))
            {
                System.out.println("Enter");
                break;
            }*/
            strings.add(s);

            //strings.add(scantext.nextLine());
        }

        int minLine = Integer.MAX_VALUE; //2147483647;
        for (int i = 0; i < 5; i++)
            if (strings.get(i).length() < minLine) {
                minLine = strings.get(i).length();
            }

        for (int i = 0; i < strings.size(); i++) {
            if(strings.get(i).length() == minLine)
                System.out.println(strings.get(i));
        }

    }
}
