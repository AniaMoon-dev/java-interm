package com.lm2a.colecciones.ejercicios_resueltos;

import java.util.HashSet;

public class Ejercicio9 {

    public static void main(String[] args) {
        // Create a empty hash set
        HashSet<String> colores1 = new HashSet<String>();
        // use add() method to add values in the hash set
        colores1.add("Red");
        colores1.add("Green");
        colores1.add("Black");
        colores1.add("White");

        HashSet<String> colores2 = new HashSet<String>();
        colores2.add("Red");
        colores2.add("Pink");
        colores2.add("Black");
        colores2.add("Orange");
        //comparison output in hash set
        HashSet<String>result_set = new HashSet<String>();
        for (String element : colores1){
            System.out.println(colores2.contains(element) ? "Yes" : "No");
        }
    }
}
