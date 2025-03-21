package com.lm2a.colecciones.ejercicios_resueltos;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio10 {

    public static void main(String[] args) {

        Map<String, User> hashMap = new HashMap<>();
        hashMap.put("Juan", new User("Juan", "juan@gmail.com", 55));
        hashMap.put("Pedro", new User("Pedro", "pedro@gmail.com", 35));
        hashMap.put("Luis", new User("Luis", "luis@gmail.com", 15));

        for(Map.Entry x:hashMap.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
        }

    }

}
