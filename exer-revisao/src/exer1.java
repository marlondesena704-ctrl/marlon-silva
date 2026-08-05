import java.text.DecimalFormat;
import java.util.Scanner;

public class exer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Informe o nome do funcionário: ");
        String nome = sc.next().toUpperCase();

        System.out.println("Informe a matrícula do funcionário: ");
        String matricula = sc.next();

        System.out.println("Quantas horas " + nome + " trabalha por semana? ");
        double horaSemana = sc.nextDouble();

        System.out.println("Informe o valor da hora trabalhada do " + nome );
        double horaTrabalhada = sc.nextDouble();

        double salario = horaTrabalhada * horaSemana * 4;

        System.out.println("Dados do funcionário " + nome + ": ");
        System.out.println("Matrícula: " + matricula);
//        System.out.printf(  "Salário: R$ %.2f " , salario );
        System.out.println("Salário: R$" + df.format(salario));

        sc.close();
    }
}
