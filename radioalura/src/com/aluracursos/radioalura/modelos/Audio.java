// Paquete donde se encuentra la clase
package com.aluracursos.radioalura.modelos;

// Clase base o superclase de Cancion y Podcast
public class Audio {

    // Atributos comunes a todos los audios (canciones o podcasts)
    private String titulo;
    private int totalDeReproducciones;
    private int totalDeMeGusta;
    private int clasificacion; // Este atributo se puede sobreescribir en las subclases

    // Método que incrementa en 1 el total de "me gusta"
    public void meGusta(){
        this.totalDeMeGusta++;
    }

    // Método que incrementa en 1 el total de reproducciones
    public void reproduce(){
        this.totalDeReproducciones++;
    }

    // Getter para el título
    public String getTitulo() {
        return titulo;
    }

    // Setter para el título
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Getter para el total de reproducciones
    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    // Setter para el total de reproducciones
    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    // Getter para el total de "me gusta"
    public int getTotalDeMeGusta() {
        return totalDeMeGusta;
    }

    // Setter para el total de "me gusta"
    public void setTotalDeMeGusta(int totalDeMeGusta) {
        this.totalDeMeGusta = totalDeMeGusta;
    }

    // Getter para la clasificación
    public int getClasificacion() {
        return clasificacion;
    }

    // Setter para la clasificación
    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}
