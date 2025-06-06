package com.lm2a.streams.grupo1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Alumno> listaAlumnos = new ArrayList<>();

        listaAlumnos.add(new Alumno(1, "1717213183", "Javier Ignacio", "Molina Cano", "Java 8", 7, 28));
        listaAlumnos.add(new Alumno(2, "1717456218", "Lillian Eugenia", "Gómez Álvarez", "Java 8", 10, 33));
        listaAlumnos.add(new Alumno(3, "1717328901", "Sixto Naranjoe", "Marín", "Java 8", 8.6, 15));
        listaAlumnos.add(new Alumno(4, "1717567128", "Gerardo Emilio", "Duque Gutiérrez", "Java 8", 10, 13));
        listaAlumnos.add(new Alumno(5, "1717902145", "Jhony Alberto", "Sáenz Hurtado", "Java 8", 9.5, 15));
        listaAlumnos.add(new Alumno(6, "1717678456", "Germán Antonio", "Lotero Upegui", "Java 8", 8, 34));
        listaAlumnos.add(new Alumno(7, "1102156732", "Oscar Darío", "Murillo González", "Java 8", 8, 32));
        listaAlumnos.add(new Alumno(8, "1103421907", "Augusto Osorno", "Palacio Martínez", "PHP", 9.5, 17));
        listaAlumnos.add(new Alumno(9, "1717297015", "César Oswaldo", "Alzate Agudelo", "Java 8", 8, 26));
        listaAlumnos.add(new Alumno(10, "1717912056", "Gloria Amparo", "González Castaño", "PHP", 10, 28));
        listaAlumnos.add(new Alumno(11, "1717912058", "Jorge León", "Ruiz Ruiz", "Python", 8, 22));
        listaAlumnos.add(new Alumno(12, "1717912985", "John Jairo", "Duque García", "Java Script", 9.4, 32));
        listaAlumnos.add(new Alumno(13, "1717913851", "Julio Cesar", "González Castaño", "C Sharp", 10, 22));
        listaAlumnos.add(new Alumno(14, "1717986531", "Gloria Amparo", "Rodas Monsalve", "Ruby", 7, 18));
        listaAlumnos.add(new Alumno(15, "1717975232", "Gabriel Jaime", "Jiménez Gómez", "Java Script", 10, 18));

        System.out.println("-----------------------------------------");
        System.out.println("a) Alumnos cuyo nombre empieza con L o G");

        listaAlumnos.stream()
                .filter(a -> a.getNombres().startsWith("L") || a.getNombres().startsWith("G"))
                .forEach(System.out::println);
        System.out.println("-----------------------------------------");
        System.out.println("b) Cantidad de alumnos");

        System.out.println("Cantidad de alumnos: "+ listaAlumnos.stream().count());

        System.out.println("-----------------------------------------");

        System.out.println("c) Alumnos con nota > 9 del curso de PHP");

        listaAlumnos.stream()
                .filter(a -> a.getNota() > 9 && a.getNombreCurso().equals("PHP"))
                .forEach(System.out::println);

        System.out.println("-----------------------------------------");
        System.out.println("d) Dos primeros alumnos de la lista");

        listaAlumnos.stream()
                .limit(2)
                .forEach(System.out::println);



        System.out.println("-----------------------------------------");
        System.out.println("e) Alumnos con menor edad (version comparing)");

        System.out.println(listaAlumnos.stream()
                .min(Comparator.comparingInt(Alumno::getEdad)));

        System.out.println("-----------------------------------------");
        System.out.println("f) Alumnos con mayor edad");

        System.out.println(listaAlumnos.stream()
                .min((a1, a2) -> a2.getEdad() - a1.getEdad()));

        System.out.println("-----------------------------------------");
        System.out.println("g) Primer alumno de la lista (findFirst)");

        Optional<Alumno> first = listaAlumnos.stream()
                .findFirst();
        if (first.isPresent()) {
            System.out.println(first.get());
        }

        System.out.println("-----------------------------------------");
        System.out.println("h) Alumnos con lenguajes terminados en t");

        listaAlumnos.stream()
                .filter(alumno -> alumno.getNombreCurso().endsWith("t"))
                .forEach(System.out::println);

        System.out.println("-----------------------------------------");
        System.out.println("i) Alumnos con letra a en el nombre del curso");

        listaAlumnos.stream()
                .filter(alumno -> alumno.getNombreCurso().contains("a"))
                .forEach(System.out::println);

        System.out.println("-----------------------------------------");
        System.out.println("j) Alumnos con nombre > 10 caracteres");

        listaAlumnos.stream()
                .filter(alumno -> alumno.getNombres().length() > 10)
                .forEach(System.out::println);

        System.out.println("-----------------------------------------");
        System.out.println("k) Alumnos cuyo nombre empieza con J y tiene longitud <=6");

        Predicate<Alumno> empiezaP = alumno -> alumno.getNombres().startsWith("J");
        Predicate<Alumno> nombre6 = alumno -> alumno.getNombres().length() <= 6;

        listaAlumnos.stream()
                .filter(empiezaP.and(nombre6))
                .forEach(System.out::println);
    }
}
