package com.lm2a.colecciones.ej1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<User>();

        users.add(new User("Juan", "juan@gmail.com", 55));
        users.add(new User("Juan2", "juan2@gmail.com", 51));
        users.add(new User("Juan3", "juan3@gmail.com", 15));
        users.add(new User("Juan4", "juan4@gmail.com", 25));
        users.add(new User("Juan5", "juan5@gmail.com", 61));

//        Iterator<User> iterator = users.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

//        for(int i=0; i<users.size(); i++) {
//            System.out.println(users.get(i));
//        }

        for(User user : users) {
            System.out.println(user);
        }
    }
}
