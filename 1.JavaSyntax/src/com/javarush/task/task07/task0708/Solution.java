package com.javarush.task.task07.task0708;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.


Требования:
1. Инициализируй поле класса новым ArrayList<>
2. Программа должна считывать 5 строк с клавиатуры и записывать их в список strings.
3. Программа должна выводить самую длинную строку на экран.
4. Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.
*/

public class Solution {
    private static List<String> strings = new ArrayList<>();

        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);


            for (int i = 0; i < 5; i++) {
                strings.add(reader.nextLine());
            }

            int maxLength = 0;
            for (int i = 0; i < 5; i++)
                if (strings.get(i).length() > maxLength) {
                    maxLength = strings.get(i).length();
            }

            for (int i = 0; i < strings.size(); i++) {
                if (strings.get(i).length() == maxLength)
                    System.out.println(strings.get(i));
            }

            // рабочий второй вариант
            /*
            for (String string : strings) {
                if (string.length() > maxLength) {
                    maxLength = string.length();
                }
            }

            for (String string : strings) {
                if (string.length() == maxLength) {
                    System.out.println(string);
                }
            }
            */
        }
}

