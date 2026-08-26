import java.util.Scanner;

public class exer12comRetorno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe uma palavra: ");
        String palavra = sc.next();

        System.out.println(obterCaracter(palavra));

    }

    public static char obterCaracter(String palavra) {

        return palavra.length() % 2 == 0 ? palavra.charAt(0) : palavra.charAt(1);
    }
}
