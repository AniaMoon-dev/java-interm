package com.lm2a.enums;

public class Empleado {
    private String nombre;
    private int categoria;
    private TipoEmpleado tipoEmpleado;

    public Empleado(String nombre, int categoria, TipoEmpleado tipoEmpleado) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public TipoEmpleado getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", categoria=" + categoria +
                ", tipoEmpleado=" + tipoEmpleado +
                '}';
    }
}
