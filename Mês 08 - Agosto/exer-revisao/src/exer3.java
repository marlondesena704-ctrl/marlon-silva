import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String grau = "";

        System.out.println("Informe seu nome: ");
        String nome = sc.nextLine().toUpperCase();

        System.out.println("Informe a sua altura: ");
        double altura = sc.nextDouble();

        System.out.println("Informe a sua massa: ");
        double massa = sc.nextDouble();

//        double imc = (altura * altura) / massa;
        double imc = massa / Math.pow(altura, 2);

        if (imc <= 18.5) {
            grau = "Magreza";

        } else if (imc <= 24.9) {
            grau = "Saudável";

        } else if (imc <= 29.9) {
            grau = "Sobrepeso";

        } else if (imc <= 34.9) {
            grau = "Obesidade Grau I";

        } else if (imc <= 39.9) {
            grau = "Obesidade Grau II (severa)";

        } else {
            grau = "Obesidade Grau III (morbida)";
        }

        System.out.println("Nome: " + nome);
        System.out.printf("Altura: %.2fm%n", altura);
        System.out.printf("Massa: %.2fkg%n", massa);
        System.out.println("Grau de obesidade: " + grau);

        sc.close();
    }
}
