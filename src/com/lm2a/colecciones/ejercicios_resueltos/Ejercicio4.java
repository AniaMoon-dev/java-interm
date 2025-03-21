package com.lm2a.colecciones.ejercicios_resueltos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<String>();

        nombres.add("Juan");
        nombres.add("Luis");
        nombres.add("Carlos");
        nombres.add("Santiago");
        nombres.add("Felipe");

        List<String> colores = new ArrayList<String>();

        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Amarillo");
        colores.add("Verde");
        colores.add("Magenta");

        System.out.println(copyArrays(colores, nombres));
    }

    public static List<String> copyArrays(List<String> src, List<String> dest){
        Iterator<String> iterator = src.iterator();
        dest.clear();
        while(iterator.hasNext()){
            String dato = iterator.next();
            dest.add(dato);
        }
        return dest;

    }
}
