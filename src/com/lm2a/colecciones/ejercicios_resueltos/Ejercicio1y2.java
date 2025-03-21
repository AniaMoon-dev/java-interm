package com.lm2a.colecciones.ejercicios_resueltos;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1y2 {

    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();
        users.add(new User("Juan", "juan@gmail.com", 55));
        users.add(new User("Juan2", "juan2@gmail.com", 51));
        users.add(new User("Juan3", "juan3@gmail.com", 15));
        users.add(new User("Juan4", "juan4@gmail.com", 25));
        users.add(new User("Juan5", "juan5@gmail.com", 61));

        getUserByIndex(3, users);

        System.out.println(getUserByUsername("Juan2", users));
    }

    public static void getUserByIndex(int index, List<User> users){
        User u = users.get(index);
        System.out.println(u);
    }

    public static User getUserByUsername(String username, List<User> users){
        for(User u : users){
            if(u.getUsername().equals(username)){
                return u;
            }
        }
        return null;
    }
}
