public class exer5comParametro {
    public static void main(String[] args) {
        int base = 76;
        exibirNumero(base,55,69);
    }
    public static void exibirNumero(int base, int valor1, int valor2){

        int dist1 = Math.abs(valor1 - base);
        int dist2 = Math.abs(valor2 - base);

        System.out.println("Número base: " + base);
        System.out.println("Primeiro valor: " + valor1);
        System.out.println("Segundo valor: " + valor2);
        System.out.println("\n");

        if(dist1<dist2){
            System.out.println("O valor " + valor1 + " está mais próximo de " + base);
        } else if (dist2<dist1) {
            System.out.println("O valor de " + valor2 + " está mais próximo de " + base);
        }else{
            System.out.println("Os dois valores estão à mesma distância de " + base);
        }
    }
}
