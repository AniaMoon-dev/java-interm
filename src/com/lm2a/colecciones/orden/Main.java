package com.lm2a.colecciones.orden;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User("Juan", "juan@gmail.com", 55));
        users.add(new User("Pedro", "pedro@gmail.com", 51));
        users.add(new User("Javier", "javier@gmail.com", 15));
        users.add(new User("Mario", "mario@gmail.com", 25));
        users.add(new User("Nicanor", "nicanor@gmail.com", 61));

        Comparator<User> xEdad = (u1, u2) -> u1.getAge() - u2.getAge();

        Comparator<User> xEmail = (u1, u2) -> u1.getUsername().compareTo(u2.getUsername());


        //(u1, u2) -> u1.getAge() - u2.getAge();

        //(u1, u2) -> u1.getUsername().compareTo(u2.getUsername());

        Collections.sort(users, new NameComparator());
        System.out.println("----------------------xNombre------------------------------");
        for(User user : users) {
            System.out.println(user);
        }

        Collections.sort(users, xEdad);
        System.out.println("----------------------xEdad------------------------------");
        for(User user : users) {
            System.out.println(user);
        }

        Collections.sort(users, (u1, u2) -> u1.getUsername().compareTo(u2.getUsername()));
        System.out.println("----------------------xEmail------------------------------");
        for(User user : users) {
            System.out.println(user);
        }
    }
}
