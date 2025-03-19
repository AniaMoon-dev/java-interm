package com.lm2a.colecciones;

import java.util.LinkedList;

public class LinkedListJava {

    public static void main(String[] args) {
        LinkedList<Integer> linkedLista = new LinkedList<>();

        for(int i=0; i<10; i++) {
            linkedLista.add(i);
        }

        System.out.println(linkedLista);

    for(int i=0; i<10; i++) {
        System.out.println(linkedLista.get(i));
    }


    }
}
