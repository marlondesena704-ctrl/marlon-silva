import java.util.Scanner;

public class exer7comRetorno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Informe um número de 1 a 4:");
        int valor = sc.nextInt();

        switch (valor) {
            case (1) -> System.out.println(imprimirPrimavera());
            case (2) -> System.out.println(imprimirVerao());
            case (3) -> System.out.println(imprimirInverno());
            case (4) -> System.out.println(imprimirOutono());
        }

    }

    public static String imprimirPrimavera() {
        return "É primavera\nE as flores desabrocham";
    }

    public static String imprimirVerao() {
        return "É verão\nE o tempo está quente";
    }

    public static String imprimirInverno() {
        return "É inverno\nE está frio";
    }

    public static String imprimirOutono() {
        return "É outono\nE as folhas caem";
    }


}
