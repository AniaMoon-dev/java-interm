package com.lm2a.anotaciones;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Object> lista = new ArrayList<>();
        lista.add(new Book("100 años de soledad", "Garcia Marquez"));
        Procesadora.procesar(lista);
    }
}
