import java.util.Scanner;

public class exer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma opção de 1 a 4: ");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                imprimirVerao();
                break;
            case 2:
                imprimirOutono();
                break;
            case 3:
                imprimirInverno();
                break;
            case 4:
                imprimirPrimavera();
                break;
        }

    }

    public static void imprimirVerao() {
        System.out.println("É verão");
        System.out.println("E o tempo está quente");
    }

    public static void imprimirOutono() {
        System.out.println("É outono");
        System.out.println("E as folhas caem");
    }

    public static void imprimirInverno() {
        System.out.println("É inverno");
        System.out.println("E está frio");
    }

    public static void imprimirPrimavera() {
        System.out.println("É primavera");
        System.out.println("E as flores desabrocham");
    }
}
