package com.lm2a.genericos;

public class Main0 {

    public static void main(String[] args) {
        Test0<Integer> iObj = new Test0<>(15);

        System.out.println(iObj.getObj());

        Test0<String> sObj = new Test0<>("Hoy es jueves");

        System.out.println(sObj.getObj());

        Test0<User> uObj = new Test0<>(new User(8, "Juan Perez"));

        System.out.println(uObj.getObj());
    }
}
