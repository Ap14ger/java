public class Comparar {
    private  int numero1;
    private int numero2;

    public Comparar(int numero1, int numero2){
        this.numero1=numero1;
        this.numero2=numero2;

    }
    public void compara(){
        if(numero1 > numero2){
            System.out.println(numero1 + "es mayor que " + numero2);
        }else if (numero2> numero1){
            System.out.println(numero2+ " es mayor que " + numero1);
        }else {
            System.out.println("Ambos numeros son iguales. ");
        }
    }
}
