package com.parcial;

public class LibroTextoUNIAC extends LibroTexto {
    private String facultad;

    public LibroTextoUNIAC() {
        super();
        this.facultad = "";
    }

    public LibroTextoUNIAC(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados,
                           String cursoAsociado, String facultad) {
        super(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados, cursoAsociado);
        this.facultad = facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return "LibroTextoUNIAC{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", numeroEjemplares=" + getNumeroEjemplares() +
                ", numeroEjemplaresPrestados=" + getNumeroEjemplaresPrestados() +
                ", cursoAsociado='" + getCursoAsociado() + '\'' +
                ", facultad='" + facultad + '\'' +
                '}';
    }
}