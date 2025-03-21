package com.lm2a.colecciones.ejercicios_resueltos;

import java.util.HashSet;

public class Ejercicio5 {

    public static void main(String[] args) {
        HashSet<String> colores = new HashSet<String>();

        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Amarillo");
        colores.add("Verde");
        colores.add("Magenta");

        cantidadItems(colores);
    }

    public static void cantidadItems(HashSet<String> hashSet){
        System.out.println(hashSet.size());
    }
}
