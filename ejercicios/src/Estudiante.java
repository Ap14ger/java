public class Estudiante {
    private String nombre;
    private double media;

    public Estudiante(String nombre, double media) {
        this.nombre = nombre;
        this.media = media;
    }

    public void mostrarSituacion() {
        System.out.println(nombre + " tiene una media de " + media + " y esta: ");
        if (media > 7.0) {
            System.out.println("Aprobado");
        } else if (media >= 5.0) {
            System.out.println("En recuperacion ");
        } else {
            System.out.println("Reprobado");
        }
    }
}