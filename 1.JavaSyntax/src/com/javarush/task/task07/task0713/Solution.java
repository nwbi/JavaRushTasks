package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> listOther = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            int number;
            number = scan.nextInt();
            list.add(number);

            if(list.get(i)%3 == 0 && list.get(i)%2 ==0){
                list3.add(list.get(i));
                list2.add(list.get(i));
            }
            else if (list.get(i)%3 == 0){
                list3.add(list.get(i));
            }
            else if(list.get(i)%2 == 0){
                list2.add(list.get(i));
            }
            else {
                listOther.add(list.get(i));
            }
        }

        //System.out.println("---");
        printList(list3); //нацело делятся на 3
        //System.out.println("--");
        printList(list2); //нацело делятся на 2
        //System.out.println("-");
        printList(listOther); //остальные числа

    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
