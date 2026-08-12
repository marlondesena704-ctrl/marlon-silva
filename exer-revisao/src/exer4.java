import java.text.DecimalFormat;
import java.util.Scanner;

public class exer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int atleta = 0;
        double somaAltura = 0;
        double mediaAltura;
        double maiorAltura = 0;
        double menorAltura = Double.MAX_VALUE;
        int maiorInscricao = 0;
        int menorInscricao = 0;


        System.out.println("Informe o número de inscrição do atleta: ");
        String inscricao = sc.next();

        int codigo = 0;
        while (!inscricao.equals("0")) {
            System.out.println("Informe o número de inscrição do atleta: (0 para encerrar)");
            inscricao = sc.next();
            if (inscricao.equals("0")) {
                System.out.println("Quantidade de atletas cadastrados: " + atleta);
                System.out.println("Maior: " + maiorAltura + "Inscrição: " + maiorInscricao);
                System.out.println("Menor: " + menorAltura + "Inscrição: " + menorInscricao);
                mediaAltura = somaAltura / atleta;
                System.out.println("Média de altura entre os atletas: " + df.format(mediaAltura));
                break;
            }

            System.out.println("Informe a altura do atleta: ");
            double alturaAtual = sc.nextDouble();

            maiorAltura = Math.max(maiorAltura, alturaAtual);
            menorAltura = Math.min(menorAltura, alturaAtual);


            atleta++;
            somaAltura += alturaAtual;


        }

    }
}
