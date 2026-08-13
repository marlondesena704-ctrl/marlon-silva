import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um nome: (Nicolas ou Greg)");
        String nome = sc.next();

        if (nome.equalsIgnoreCase("Nicolas")) {
            introduzirNicolas();
        } else if (nome.equalsIgnoreCase("Greg")) {
            introduzirGregory();
        }
    }

    public static void introduzirNicolas() {
        System.out.println("O nome dele é Nicolas");
        System.out.println("Ele tem 17 anos");
        System.out.println("Ele é estudante de desenvolvimento de sistemas.");
    }

    public static void introduzirGregory() {
        System.out.println("O nome dele é Greg");
        System.out.println("Ele tem 17 anos");
        System.out.println("Ele é estudante de desenvolvimento de sistemas.");
    }

}
