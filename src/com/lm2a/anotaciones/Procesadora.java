package com.lm2a.anotaciones;

import java.lang.reflect.Field;
import java.util.List;

public class Procesadora {

    public static void procesar(List<Object> lista) {


        try {
            for (Object o : lista) {
                Field[] declaredFields = o.getClass().getDeclaredFields();
                for (Field f : declaredFields) {
                    Imprimible annotation = f.getAnnotation(Imprimible.class);

                    if (annotation != null) {
                        if (annotation.mayusculas()) {
                            System.out.println(f.get(o).toString().toUpperCase());
                        }else{
                            System.out.println(f.get(o).toString());
                        }
                    }
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
