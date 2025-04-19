public  class Numero {
    private  int valor;

    public  Numero(int valor){
        this.valor = valor;
    }
    public boolean esPar(){
        return valor % 2 ==0;

    }
    public void mostrarParidad(){
        if (esPar()){
            System.out.println(valor + " es par");
        }else {
            System.out.println(valor + " es impar");
        }

    }
}
