package com.lm2a.opcionales.sin;

public class Nota {

    private String asignatura;
    private double valor;

    public Nota(String asignatura, double valor) {
        this.asignatura = asignatura;
        this.valor = valor;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
