package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
       HashMap<String, Integer> hm = new HashMap<>();

       hm.put("Лесковец", 250);
       hm.put("Кульпин", 550);
       hm.put("Жукова", 220);
       hm.put("Яковлев", 750);
       hm.put("Ушакова", 1250);
       hm.put("Шакуро", 250);
       hm.put("Мокрушин", 230);
       hm.put("Трофимов", 2250);
       hm.put("Кошелев", 350);
       hm.put("Кабанов", 450);

       return hm;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {

        HashMap<String, Integer> copy = new HashMap<String, Integer>(map);

        for(HashMap.Entry<String, Integer> pair : copy.entrySet()){

            if (pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
        }

         /*for(HashMap.Entry<String, Integer> pair : map.entrySet())
        {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + " - " + value);
        }*/
    }

    public static void main(String[] args) {
        removeItemFromMap(createMap());
    }
}