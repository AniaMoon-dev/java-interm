package com.lm2a.colecciones;

public class HashDemo {
    public static void main(String[] args) {
        String s1 = "Hoy es miercoles";
        String s2 = "y vemos colecciones";
        String s3 = "hay";

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println("-------------REAL HASH FUNCTION---------");
        System.out.println(hash(s1));
        System.out.println(hash(s2));
        System.out.println(hash(s3));
    }

    /**
     * Funcion hash usada por la estructuras de tipo Set
     * @param o
     * @return
     */
    static int hash(Object o) {
        int h;
        return (o == null) ? 0 : (h = o.hashCode()) ^ (h >>> 16);
    }
}
