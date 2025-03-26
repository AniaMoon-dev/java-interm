package com.lm2a.opcionales;

public class PruebaNPE {

    public static void main(String[] args) {

        String s = null;
        System.out.println(mayusculas(s));
    }

    public static String mayusculas(String x){
        if(x != null){
            return x.toUpperCase();
        }
        return null;
    }
}
