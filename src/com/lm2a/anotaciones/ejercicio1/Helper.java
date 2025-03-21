package com.lm2a.anotaciones.ejercicio1;

/**
Hacer una anotacion que permita listar los nombres de los metodos y su longitud en caracteres
   */

public class Helper {

    String a;
    int b;
    boolean c;

    @ListarLongitud
    public void m1(){
        System.out.println("m1");
    }

    @ListarLongitud
    public void metodoDos(){
        System.out.println("m2");
    }

    @ListarLongitud
    public void metodo3(){
        System.out.println("m3");
    }
}
