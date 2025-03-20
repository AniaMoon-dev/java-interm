package com.lm2a.genericos;

public class Main1 {

    public static void main(String[] args) {
        Test1<String, User> twoObj = new Test1<>("usuario1", new User(8, "Juan Perez"));
        twoObj.print();

    }
}
