package com.lm2a.excepciones;

public class ThrowDemo {

    public static void main(String[] args) {
        checkAge(10);
    }

    static void checkAge(int age){
        if(age<18){
            throw new RuntimeException("El age debe ser mayor que el 18");
        }else{
            System.out.println("Adelante, tiene la edad necesaria");
        }
    }
}
