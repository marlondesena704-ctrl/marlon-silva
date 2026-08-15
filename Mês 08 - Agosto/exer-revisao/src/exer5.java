import java.util.Arrays;
import java.util.Scanner;

public class exer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = {5, 6, 3, 35, 76};
        int iMaior = 0;
        int iMenor = 0;
        int somaValor = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[iMaior]) {
                iMaior = i;
            }
            if (array[i] < array[iMenor]) {
                iMenor = i;
            }
            somaValor += array[i] / array.length;

        }
        double media = somaValor;
        for (int n : array) {
            System.out.println("Vetor: " + Arrays.toString(array));
            System.out.println("Média dos valores do vetor: " + media);
            System.out.println("Menor: " + array[iMenor]);
            System.out.println("Maior: " + array[iMaior]);
            break;
        }
    }
}
