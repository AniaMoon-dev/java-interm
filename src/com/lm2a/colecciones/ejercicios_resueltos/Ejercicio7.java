package com.lm2a.colecciones.ejercicios_resueltos;

import java.util.HashSet;

public class Ejercicio7 {
    public static void main(String[] args) {
        // Create a empty hash set
        HashSet<String> hSet = new HashSet<String>();
        // use add() method to add values in the hash set
        hSet.add("Red");
        hSet.add("Green");
        hSet.add("Black");
        hSet.add("White");
        hSet.add("Pink");
        hSet.add("Yellow");
        System.out.println("Original Hash Set: " + hSet);
        HashSet <String> newHSet = new HashSet <String>();
        newHSet = (HashSet)hSet.clone();
        System.out.println("Cloned Hash Set: " + newHSet);
    }
}
