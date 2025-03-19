package com.lm2a.colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<String>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("E");
        lista.add("F");
        lista.add("G");
        lista.add("A");

        Iterator<String> iterator = lista.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
