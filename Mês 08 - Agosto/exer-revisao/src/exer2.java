import java.text.DecimalFormat;
import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Informe o nome do vendedor: ");
        String nome = sc.nextLine().toUpperCase();

        System.out.println("Informe o salário do vendedor: ");
        double salarioFixo = sc.nextDouble();

        System.out.println("Informe o total de vendas efetuadas no mês em R$: ");
        double vendas = sc.nextDouble();

        double comissao = vendas * 0.15;
        double salarioFinal = salarioFixo + comissao;

//        System.out.printf(nome + " irá receber no total esse mês um salário de R$ %.2f" , salarioFinal);
        System.out.println(nome + "irá receber no total esse mês um salário de R$" + df.format(salarioFinal));

        sc.close();

    }
}
