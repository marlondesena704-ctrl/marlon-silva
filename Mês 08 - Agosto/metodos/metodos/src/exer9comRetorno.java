import java.util.Scanner;

public class exer9comRetorno {
    public static void main(String[] args) {

        int valor = 99;
        System.out.println(imprimirParOuImpar(valor));
    }

    public static boolean imprimirParOuImpar(int valor) {

        return valor % 2 == 0;

    }
}
