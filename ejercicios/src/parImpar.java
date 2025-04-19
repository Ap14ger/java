import java.util.Scanner;

public class parImpar{
        public  static void main(String[] args){
            Scanner scanner = new Scanner(System.in);


            //par o impar
            System.out.println("Ingrese un numero entero: ");
            int numero = scanner.nextInt();

            Numero n = new Numero(numero);
            n.mostrarParidad();
            scanner.nextLine();  // 👈 Limpiar el buffer


            //pedi contraaseña a usuario
            System.out.print("Ingrese la contraseña para acceder al sistema: ");
            String intento = scanner.nextLine();

            // 👇 Crear un objeto de tipo Acceso con la contraseña digitada
            Acceso acceso = new Acceso(intento);
            acceso.verificarAcceso();


            //notas estudiante
            System.out.println("Ingresa tu nombre: ");
            scanner.nextLine();
            String nombre = scanner.nextLine();

            System.out.println("Ingresa tu nota final: ");
            double media = scanner.nextDouble();

            Estudiante estudiante = new Estudiante(nombre, media);
            estudiante.mostrarSituacion();


            //comparador
            System.out.println("Ingresa el primer numero a comparar:  ");
            int num1 = scanner.nextInt();

            System.out.print("Ingresa el segundo número a comparar: ");
            int num2 = scanner.nextInt();

            Comparar comparador = new Comparar(num1, num2);
            comparador.compara();






                }
    }
