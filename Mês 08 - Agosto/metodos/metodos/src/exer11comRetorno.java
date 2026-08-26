import java.util.Arrays;

public class exer11comRetorno {
    public static void main(String[] args) {


        int[] vetor = {77, 59, 60, 54, 43, 89};
        System.out.println(Arrays.toString(vetor));
        System.out.println("Maior valor do vetor: ");
        System.out.println(imprimirMaiorValor(vetor));

        System.out.println("Menor valor do vetor: ");
        System.out.println(imprmirMenorValor(vetor));

        System.out.println("Média dos valores do vetor: ");
        System.out.println(calcularMediaVetor(vetor));
    }

    public static int imprimirMaiorValor(int[] vetor) {

        int maiorValor = Integer.MIN_VALUE;


        for (int j : vetor) {
            if (j > maiorValor) {
                maiorValor = j;
            }

        }
        return maiorValor;
    }

    public static int imprmirMenorValor(int[] vetor) {

        int menorValor = Integer.MAX_VALUE;

        for (int j : vetor) {
            if (j < menorValor) {
                menorValor = j;
            }
        }


        return menorValor;

    }

    public static int calcularMediaVetor(int[] vetor) {

        int somaMedia = 0;

        for (int j : vetor) {

            somaMedia += j;

        }
        return somaMedia / vetor.length;
    }
}





