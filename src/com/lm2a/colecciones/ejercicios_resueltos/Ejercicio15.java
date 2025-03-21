package com.lm2a.colecciones.ejercicios_resueltos;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio15 {

    public static void main(String[] args) {

        Map<String, User> hashMap = new HashMap<>();
        hashMap.put("Juan", new User("Juan", "juan@gmail.com", 55));
        hashMap.put("Pedro", new User("Pedro", "pedro@gmail.com", 35));
        hashMap.put("Luis", new User("Luis", "luis@gmail.com", 15));

        Collection<User> values = hashMap.values();

        String nombresUnidos = "";

        for(User u: values){
            nombresUnidos += " "+u.getUsername();

        }

        System.out.println(nombresUnidos);
    }
}
