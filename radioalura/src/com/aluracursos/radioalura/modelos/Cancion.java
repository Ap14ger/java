// Paquete donde se encuentra la clase
package com.aluracursos.radioalura.modelos;

// La clase Cancion hereda de la clase Audio
public class Cancion extends Audio {

    // Atributos propios de una canción
    private String album;
    private String cantante;
    private String genero;

    // Sobrescribe el método getClasificacion() de la clase Audio
    @Override
    public int getClasificacion() {
        // Si la canción tiene más de 5000 "me gusta", su clasificación es 8
        if (getTotalDeMeGusta() > 5000){
            return 8;
        } else {
            // Si tiene 5000 o menos, su clasificación es 4
            return 4;
        }
    }

    // Getter para el atributo 'album'
    public String getAlbum() {
        return album;
    }

    // Setter para el atributo 'album'
    public void setAlbum(String album) {
        this.album = album;
    }

    // Getter para el atributo 'cantante'
    public String getCantante() {
        return cantante;
    }

    // Setter para el atributo 'cantante'
    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    // Getter para el atributo 'genero'
    public String getGenero() {
        return genero;
    }

    // Setter para el atributo 'genero'
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
