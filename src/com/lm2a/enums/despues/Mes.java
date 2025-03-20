package com.lm2a.enums.despues;

public enum Mes {

    ENERO("Enero", 31),
    FEBRERO("Febrero", 28),
    MARZO("Marzo", 29),
    ABRIL("Abril", 30),
    MAYO("Mayo", 31),
    JUNIO("Junio", 28),
    JULIO("Julio", 29),
    AGOSTO("Agosto", 30),
    SEPTIEMBRE("Septiembre", 31),
    OCTUBRE("Octubre", 31),
    NOVIEMBRE("Noviembre", 28),
    DICIEMBRE("Diciembre", 31);

    private String nombre;
    private int dias;

    private Mes(String nombre, int dias) {
        this.nombre = nombre;
        this.dias = dias;
    }

    public static Mes[] getWinterMonths(){
        return new Mes[] {DICIEMBRE, ENERO, FEBRERO};
    }

    public String getNombre() {
        return nombre;
    }

    public int getDias() {
        return dias;
    }
}
