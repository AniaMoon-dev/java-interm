package com.lm2a.excepciones.custom;

public class Main {

    public static void main(String[] args) {

        try {
            m1(true);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Este es el mensaje del bloque catch");
        }
    }

    public static void m1(boolean exception) throws MiExcepcion {
        if(exception){
            throw new MiExcepcion("Este es el mensaje de mi excepcion");
        }
    }

}
