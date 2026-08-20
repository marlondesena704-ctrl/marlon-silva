import java.util.Scanner;

public class exer8comRetorno {
    public static void main(String[] args) {

        System.out.println("Média aritmética: ");
        System.out.println(calcularMediaAritmetica(9.8,8.2,4.5));

    }
    public static double calcularMediaAritmetica(double v1, double v2, double v3){
        return v1+v2+v3/3;
    }
}
