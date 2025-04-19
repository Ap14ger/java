// Paquete principal de la aplicación
package com.aluracursos.radioalura.principal;

// Importación de las clases necesarias desde el paquete 'modelos'
import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.MisFavoritos;
import com.aluracursos.radioalura.modelos.Podcast;

// Clase principal que contiene el método main
public class Principal {
    public static void main(String[] args) {

        // Se crea un objeto Cancion y se le asignan valores
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        // Se crea un objeto Podcast y se le asignan valores
        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela Aguiar");
        miPodcast.setTitulo("Cafe.Tech");

        // Simula que a la canción le dan 100 "me gusta"
        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }

        // Simula 2000 reproducciones de la canción
        for (int i = 0; i < 2000; i++) {
            miCancion.reproduce();
        }

        // Simula que al podcast le dan 100 "me gusta"
        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }

        // Simula 8000 reproducciones del podcast
        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduce();
        }

        // Muestra por consola las estadísticas de la canción
        System.out.println("Total reproducciones: " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de Me Gusta: " + miCancion.getTotalDeMeGusta());

        // Se crea una instancia de la clase que gestiona los favoritos
        MisFavoritos favoritos = new MisFavoritos();

        // Se agregan tanto el podcast como la canción a la lista de favoritos
        favoritos.adicione(miPodcast);
        favoritos.adicione(miCancion);
    }
}
