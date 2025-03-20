package com.lm2a.enums.antes;

public class Mes {
    private String nombre;
    private int dias;

    private Mes(String nombre, int dias) {
        this.nombre = nombre;
        this.dias = dias;
    }

    public static Mes ENERO = new Mes("ENERO", 31);
    public static Mes FEBRERO = new Mes("FEBRERO", 28);
    public static Mes MARZO = new Mes("MARZO", 31);

    @Override
    public String toString() {
        return "Mes{" +
                "nombre='" + nombre + '\'' +
                ", dias=" + dias +
                '}';
    }
}
