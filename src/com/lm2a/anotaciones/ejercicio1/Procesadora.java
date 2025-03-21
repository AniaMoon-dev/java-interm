package com.lm2a.anotaciones.ejercicio1;

import java.lang.reflect.Method;

public class Procesadora {

    public static void procesar(Class myClass){

        for (Method m : myClass.getDeclaredMethods()) {

            if (m.isAnnotationPresent(ListarLongitud.class)){

                String methodName = m.getName();

                int nameLength = methodName.length();

                System.out.println("Nombre método: " + methodName + " Longitud: " + nameLength);

            }



        }



    }

}