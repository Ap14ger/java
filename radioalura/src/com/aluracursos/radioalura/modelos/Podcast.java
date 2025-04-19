// Paquete donde se encuentra la clase
package com.aluracursos.radioalura.modelos;

// La clase Podcast hereda de la clase Audio
public class Podcast extends Audio {

    // Atributos específicos del podcast
    private String presentador;
    private String descripcion;

    // Sobrescribe el método getClasificacion() de la clase Audio
    @Override
    public int getClasificacion() {
        // Si el podcast tiene 2000 o más reproducciones, se clasifica como 9
        if (getTotalDeReproducciones() >= 2000){
            return 9;
        } else {
            // Si no, se clasifica como 2
            return 2;
        }
    }

    // Getter para el presentador
    public String getPresentador() {
        return presentador;
    }

    // Setter para el presentador
    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    // Getter para la descripción
    public String getDescripcion() {
        return descripcion;
    }

    // Setter para la descripción
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
