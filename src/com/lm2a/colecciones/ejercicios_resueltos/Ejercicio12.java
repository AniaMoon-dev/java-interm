package com.lm2a.colecciones.ejercicios_resueltos;

import java.util.HashMap;

public class Ejercicio12 {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMapa = new HashMap<String, Integer>();
        hashMapa.put("Red", 1);
        hashMapa.put("Green", 2);
        hashMapa.put("Black", 3);
        hashMapa.put("White", 4);
        hashMapa.put("Blue", 5);

        imprimeValor("Black", hashMapa);

        imprimeValor("XXXXX", hashMapa);
    }

    public static void imprimeValor(String clave, HashMap<String, Integer> hashMap){
        boolean b = hashMap.containsKey(clave);
        if(b){
            System.out.println(hashMap.get(clave));
        }else{
            System.out.println("No existe");
        }
    }
}
