package com.lm2a.colecciones.ejercicios_resueltos;

import java.util.HashSet;

public class Ejercicio8 {
    public static void main(String[] args) {
        // Create a empty hash set
        HashSet<String> colores = new HashSet<String>();
        // use add() method to add values in the hash set
        colores.add("Red");
        colores.add("Green");
        colores.add("Black");
        colores.add("White");
        colores.add("Pink");
        colores.add("Yellow");
        System.out.println("Original Hash Set: " + colores);
        // Creating an Array
        String[] coloresArray = new String[colores.size()];
        colores.toArray(coloresArray);

        // Displaying Array elements
        System.out.println("Array elements: ");
        for(String element : coloresArray){
            System.out.println(element);
        }
    }
}
