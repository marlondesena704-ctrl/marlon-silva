import java.text.DecimalFormat;
import java.util.Arrays;

public class exer4comParametro {

    public static void main(String[] args) {
        int[] vetor = {8, 6, 5, 7, 4, 12, 10};

        System.out.println("Vetor: " + Arrays.toString(vetor));
        encontrarMaiorValorVetor(vetor);
        encontrarMenorValorVetor(vetor);
        encontrarMediaVetor(vetor);
    }

    public static void encontrarMaiorValorVetor(int[] vetor) {
        if (vetor.length == 0) return;

        int maiorValor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
            }
        }
        System.out.println("Maior valor do vetor: " + maiorValor);
    }

    public static void encontrarMenorValorVetor(int[] vetor) {
        if (vetor.length == 0) return;

        int menorValor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menorValor) {
                menorValor = vetor[i];
            }
        }
        System.out.println("Menor valor do vetor: " + menorValor);
    }

    public static void encontrarMediaVetor(int[] vetor) {
        if (vetor.length == 0) return;

        DecimalFormat df = new DecimalFormat("0.00");
        int somaMedia = 0;

        for (int valor : vetor) {
            somaMedia += valor;
        }

        double media = (double) somaMedia / vetor.length;
        System.out.println("Média dos valores do vetor: " + df.format(media));
    }
}