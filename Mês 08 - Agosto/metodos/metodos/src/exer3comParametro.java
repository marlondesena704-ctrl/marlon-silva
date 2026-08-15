import java.util.Scanner;

public class exer3comParametro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        exibirNumero(40);
    }

    public static void exibirNumero(int valor) {


        System.out.println(valor);
        System.out.println("20 números após esse valor: ");
        for(int i =1; i<=20;i++){
            System.out.println(valor = valor+1);
        }

    }
}


