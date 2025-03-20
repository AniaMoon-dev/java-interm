package com.lm2a.colecciones;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        Map<String, Integer> map = new TreeMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);

        int b = map.get("B");
        System.out.println(b);

        map.remove("B");
        System.out.println(map);

        for(String key : map.keySet()) {
            System.out.println("Key: "+key+" Value: "+map.get(key));
        }

    }
}
