package com.lm2a.reflexion;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class InvestigaObjetos {

    public static void main(String[] args) {

        MiClase objetoDeMiClase = new MiClase();

        Class<? extends MiClase> objetoDeClassConInfoDeMiClase = objetoDeMiClase.getClass();

        String textoObtenido;

        try {
            Field variableString = objetoDeClassConInfoDeMiClase.getField("unaVariableString");

            textoObtenido = (String) variableString.get(objetoDeMiClase);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        System.out.println(textoObtenido);

        int intObtenido;

        try {
            Field variableInt = objetoDeClassConInfoDeMiClase.getDeclaredField("unaBVariableInt");
            variableInt.setAccessible(true);

            intObtenido = (int) variableInt.get(objetoDeMiClase);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        System.out.println(intObtenido);

        Field[] todasLasVariablesDeclaradas = objetoDeClassConInfoDeMiClase.getDeclaredFields();

        for(Field variable: todasLasVariablesDeclaradas) {
            System.out.println(variable.getName() + " tipo: "+variable.getType().getSimpleName());
        }


        try {
            Constructor<? extends MiClase> constructorSinParametros = objetoDeClassConInfoDeMiClase.getConstructor();
            MiClase miClase = constructorSinParametros.newInstance();
            System.out.println(miClase);
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
