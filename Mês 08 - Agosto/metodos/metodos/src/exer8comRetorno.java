import java.text.DecimalFormat;
import java.util.Scanner;

public class exer8comRetorno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Informe a primeira nota: ");
        double v1 = sc.nextDouble();

        System.out.println("Informe a segunda nota:");
        double v2 = sc.nextDouble();

        System.out.println("Informe a terceira nota: ");
        double v3 = sc.nextDouble();


        System.out.println("Média aritmética: ");
        System.out.println(df.format(calcularMediaAritmetica( v1,  v2,  v3)));

    }
    public static double calcularMediaAritmetica(double v1, double v2, double v3){

        if(v1<0 || v1 > 10 || v2 < 0 || v2 > 10 || v3 < 0 || v3 > 10){
            return 0;
        }
        return (v1+v2+v3)/3;
    }
}
