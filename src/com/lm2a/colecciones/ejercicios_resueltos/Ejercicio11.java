package com.lm2a.colecciones.ejercicios_resueltos;

import java.util.HashMap;

public class Ejercicio11 {

    public static void main(String args[]) {
        HashMap < String, Integer > hashMapa = new HashMap< String, Integer >();
        hashMapa.put("Red", 1);
        hashMapa.put("Green", 2);
        hashMapa.put("Black", 3);
        hashMapa.put("White", 4);
        hashMapa.put("Blue", 5);
        // print the map
        System.out.println("The Original map: " + hashMapa);
        System.out.println("1. Is key 'Green' exists?");
        if (hashMapa.containsKey("Green")) {
            //key exists
            System.out.println("yes! - " + hashMapa.get("Green"));
        } else {
            //key does not exists
            System.out.println("no!");
        }

        System.out.println("\n2. Is key 'orange' exists?");
        if (hashMapa.containsKey("orange")) {
            System.out.println("yes! - " + hashMapa.get("orange"));
        } else {
            System.out.println("no!");
        }
    }
}
