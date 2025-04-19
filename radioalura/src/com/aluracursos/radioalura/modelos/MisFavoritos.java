// Paquete donde se encuentra la clase
package com.aluracursos.radioalura.modelos;

// Clase que gestiona elementos favoritos (canciones o podcasts)
public class MisFavoritos {

    // Método que recibe un objeto de tipo Audio (puede ser Cancion o Podcast)
    public void adicione(Audio audio) {

        // Verifica la clasificación del audio
        if (audio.getClasificacion() >= 8) {
            // Si la clasificación es 8 o más, se considera un favorito destacado
            System.out.println(audio.getTitulo() + " Es uno de los favoritos");
        } else {
            // Si no, también se considera favorito, pero con menos entusiasmo
            System.out.println(audio.getTitulo() + " Tambien es favorito");
        }
    }
}
