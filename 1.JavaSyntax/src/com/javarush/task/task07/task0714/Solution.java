package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> listText = new ArrayList<>();
        Scanner scanText = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            listText.add(scanText.nextLine());
        }

        //System.out.println(listText.size());
        listText.remove(2);
        //System.out.println(listText.size());

        int w = listText.size() - 1;

        while(w >= 0){
            System.out.println(listText.get(w));
            w--;
        }

    }
}


