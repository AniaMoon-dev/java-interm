package com.lm2a.lambdas.util;

import java.util.function.Consumer;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        User usuario1 = new User("Juan Perez", "juan@perez.es", 35);

        System.out.println(extraeNombre(usuario1, x -> x.getUsername()));

        Consumer<User> c = System.out::println; //expresion lambda conocida como referencia a metodo

        Consumer<User> hanan = user -> System.out.println(user.toString());

        imprime(usuario1, hanan);

        Function<String, String> may = String::toUpperCase;

        System.out.println(mayusculas(usuario1.getEmail(), may));

        System.out.println(mayusculas(usuario1.getEmail(), String::toUpperCase));

    }

    public static String extraeNombre(User u, Function<User, String> func) {
        return func.apply(u);
    }

    public static void imprime(User u, Consumer<User> func) {
        func.accept(u);
    }

    public static String mayusculas(String x, Function<String, String> func) {
        return func.apply(x);
    }
}
