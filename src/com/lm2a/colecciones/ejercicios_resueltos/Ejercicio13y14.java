package com.lm2a.colecciones.ejercicios_resueltos;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Ejercicio13y14 {
    public static void main(String args[]) {
        HashMap<String, Integer> hashMapa = new HashMap<String, Integer>();
        hashMapa.put("Red", 1);
        hashMapa.put("Green", 2);
        hashMapa.put("Black", 3);
        hashMapa.put("White", 4);
        hashMapa.put("Blue", 5);

        Set<String> claves = hashMapa.keySet();
        for(String clave:claves){
            System.out.println(clave);
        }

        Collection<Integer> values = hashMapa.values();

        for(Integer value:values){
            System.out.println(value);
        }

    }
}
