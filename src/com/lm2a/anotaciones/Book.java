package com.lm2a.anotaciones;

public class Book {
    @Imprimible(mayusculas = true)
    public String titulo;
    @Imprimible
    public String autor;

    public Book(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
