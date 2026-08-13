import java.util.Scanner;

public class exemploComParametro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        desempenharCalculo(12, 6, 8);

    }
    public static void desempenharCalculo(double soma1, double soma2, double multiplicador){

        double resultado = (soma1 + soma2) * multiplicador;
        System.out.println(resultado);

    }
}
