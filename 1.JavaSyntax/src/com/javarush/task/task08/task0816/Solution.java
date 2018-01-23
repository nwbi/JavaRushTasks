package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallonov", new Date("JUNE 15 1981"));
        map.put("Stallidze", new Date("JUNE 30 1983"));
        map.put("Stallonyan", new Date("JULY 1 1950"));
        map.put("Stallonets", new Date("JULY 15 1960"));
        map.put("Stallokov", new Date("MAY 30 1970"));
        map.put("Stallokova", new Date("MAY 1 1988"));
        map.put("Stallonn", new Date("APRIL 15 1989"));
        map.put("Stalltwo", new Date("AUGUST 25 1987"));
        map.put("Stallfo", new Date("NOVEMBER 1 1970"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Date> iter = map.values().iterator();

        while (iter.hasNext()){
            Date date = iter.next();
            if (date.getMonth() > 4 && date.getMonth() < 8)
                iter.remove();
        }

        /*for(HashMap.Entry<String, Date> pair : map.entrySet())
        {
            String key = pair.getKey();
            Date value = pair.getValue();
            System.out.println(key + " - " + value);
        }*/

    }

    public static void main(String[] args) {
        //removeAllSummerPeople(createMap());
    }
}
