package com.lm2a.colecciones;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(1, "Hoy es miercoles");
        hm.put(2, "y vemos colecciones");
        hm.put(3, "hay");

        System.out.println(hm);

        Set<Integer> integers = hm.keySet();
        System.out.println(integers);

        Collection<String> values = hm.values();

        System.out.println(values);

        //System.out.println(hm.get(1));

        Iterator<Integer> iterator = integers.iterator();

        while(iterator.hasNext()) {
            System.out.println(hm.get(iterator.next()));
        }

    }
}
