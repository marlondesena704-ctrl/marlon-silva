import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String grau = "";

        System.out.println("Informe o nome: ");
        String nome = sc.nextLine().toUpperCase();

        System.out.println("Informe a altura: ");
        double altura = sc.nextDouble();

        System.out.println("Informe o peso: ");
        double peso = sc.nextDouble();

        double imc = (altura * altura) / peso;

        if (imc < 18.5) {
            grau = "Magreza";

        } else if (imc < 25) {
            grau = "Saudável";

        } else if (imc < 30) {
            grau = "Sobrepeso";

        } else if (imc < 35) {
            grau = "Obesidade Grau I";

        } else if (imc < 40) {
            grau = "Obesidade Grau II (severa)";

        } else {
            grau = "Obesidade Grau III (morbida)";
        }

        System.out.println("Nome: " + nome);
        System.out.printf("Altura: %.2fm%n", altura);
        System.out.printf("Peso: %.2fkg%n", peso);
        System.out.println("Grau de obesidade: " + grau);

        sc.close();
    }

}
