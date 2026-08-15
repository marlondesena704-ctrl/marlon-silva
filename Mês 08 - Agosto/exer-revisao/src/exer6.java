import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class exer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int[][] matriz = {
//                0   1    2
                {210, 3, 399900},
                {160, 3, 329900},
                {240, 3, 369000},
                {141, 2, 232000},
                {300, 4, 539900},
                {198, 4, 299900},
                {153, 3, 314900},
                {142, 3, 199000},
                {138, 3, 212000},
                {149, 3, 242500},
                {194, 4, 240000},
                {200, 3, 347000},
                {189, 3, 330000},
                {447, 5, 699900},
                {126, 3, 259900}
        };

        double soma = 0;
        double media;
        double menorCasa = Double.MAX_VALUE;
        double valorMenorCasa = Double.MAX_VALUE;
        double casaMenorQuarto = Double.MAX_VALUE;
        double casaMaiorQuarto = Double.MIN_VALUE;
        double tamanhoMenorQuarto = Double.MAX_VALUE;
        double tamanhoMaiorQuarto = Double.MIN_VALUE;
        double mediaCasa300;
        double soma1 = 0;
        int contadorCasa300 = 0;

//        laço para encontrar a média dos valores das casas;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][2];
        }

//        calcula a média do valor das casas;
        media = soma / matriz.length;

//        laço para encontrar a menor casa (em m²) e o seu valor;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0] < menorCasa) {
                menorCasa = matriz[i][0];
                valorMenorCasa = matriz[i][2];
            }
        }

//        laço para encontrar a casa com menos quartos e o seu tamanho (em m²);
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][1] < casaMenorQuarto) {
                casaMenorQuarto = matriz[i][1];
                tamanhoMenorQuarto = matriz[i][0];
            }
        }

//        laço para encontrar a casa com mais quartos e o seu tamanho (em m²);
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][1] > casaMaiorQuarto) {
                casaMaiorQuarto = matriz[i][1];
                tamanhoMaiorQuarto = matriz[i][0];
            }
        }

//        calcula a diferença de tamanho (em m²) entre a casa com maior número de quartos e a casa com menor número de quartos;
        double diferenca = tamanhoMaiorQuarto - tamanhoMenorQuarto;

//        laço para encontrar as casas que custam mais de R$300 mil reais somando o seu tamanho (em m²) e adicionando um contador;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][2] >= 300000) {
                soma1 += matriz[i][0];
                contadorCasa300++;
            }
        }

//        calcula a média do tamanho das casas que custam mais de R$300 mil reais;
        mediaCasa300 = soma1 / contadorCasa300;

        System.out.println("\n");
        System.out.println("\n");
        System.out.printf("Tamanho da casa com o maior número de quartos: %.0fm²\n", tamanhoMaiorQuarto);
        System.out.printf("Número de quartos: %.0f\n", casaMaiorQuarto);
        System.out.println("\n");
        System.out.printf("Tamanho da casa com o menor número de quartos: %.0fm²\n", tamanhoMenorQuarto);
        System.out.printf("Número de quartos: %.0f\n", casaMenorQuarto);
        System.out.printf("Diferença de tamanho da casa com o maior número de quartos para a casa com o menor número de quartos: %.0fm²\n\n", diferenca);
        System.out.printf("Tamanho da menor casa: %.0fm²\n", menorCasa);
        System.out.println("Valor da menor casa: R$" + df.format(valorMenorCasa));
        System.out.println("Média dos valores das casas: R$" + df.format(media));
        System.out.printf("Média do tamanho das casas que custam mais de R$300 mil: %.0fm²\n", mediaCasa300);
    }
}
