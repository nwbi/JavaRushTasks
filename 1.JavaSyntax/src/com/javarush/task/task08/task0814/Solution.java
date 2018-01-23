package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только три метода.
4. Метод createSet() должен создавать и возвращать множество HashSet состоящих из 20 различных чисел.
5. Метод removeAllNumbersMoreThan10() должен удалять из множества все числа больше 10.
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < 20; i++)
            set.add(i);//adding 20 integers

        return set;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {

        set.removeIf(a -> a > 10); //the use of method "removeIf" and predicate

        /*Iterator<Integer> iterator = set.iterator();

        while(iterator.hasNext()){
            Integer x = iterator.next();
            if(x > 10){
                iterator.remove();
            }
        }*/
        return set;

    }

    public static void main(String[] args) {

    }
}
