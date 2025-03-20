package com.lm2a.genericos.metodo;

import java.util.ArrayList;
import java.util.List;

public class ListaRevertida {

    public static <T> List<T> revertida(List<T> lista){
        List<T> revertida = new ArrayList<>();
        for(int i=lista.size()-1;i>=0;i--){
            revertida.add(lista.get(i));
        }
        return revertida;
    }

    public static void main(String[] args) {

        List<Integer> numeros = List.of(1,2,3,4,5,6,7,8,9);
        List<String> colores = List.of("red","blue","green","yellow","orange","pink");
        List<Integer> revertidaNumeros = revertida(numeros);
        System.out.println(revertidaNumeros);

        List<String> revertidaColores = revertida(colores);
        System.out.println(revertidaColores);


    }
}
