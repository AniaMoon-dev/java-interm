package com.lm2a.colecciones;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("Hoy");
        hs.add("es");
        hs.add("miercoles");
        hs.add("y");
        hs.add("vemos");
        hs.add("Colecciones");

        Iterator<String> iterator = hs.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
