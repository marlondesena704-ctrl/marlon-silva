import java.text.DecimalFormat;

public class exemplo1oob {
    public static void main(String[] args) {


        DecimalFormat df = new DecimalFormat("0.00");

        Veiculo v1 = new Veiculo();

        v1.modelo = "Corolla";
        v1.marca = "Toyota";
        v1.placa = "BXG9910";
        v1.ano = 2021;
        v1.preco = 120000;

        System.out.println(v1.marca + " " + v1.modelo + " " + v1.ano + " no valor de R$" + df.format(v1.preco) + " (cento e vinte mil reais)\n");

        Veiculo v2 = new Veiculo();

        v2.modelo = "Polo";
        v2.marca = "Volkswagen";
        v2.placa = "SX900H1";
        v2.ano = 2012;
        v2.preco = 40000;

        System.out.println(v2.marca + " " + v2.modelo + " " + v2.ano + " no valor de R$" + df.format(v2.preco) + " (quarenta mil reais)\n");

        Moto m1 = new Moto();

        m1.modelo = "CG 160 Titan";
        m1.marca = "Honda";
        m1.placa = "BRA2E19";
        m1.ano = 2023;
        m1.preco = 18500;

        System.out.println(m1.marca + " " + m1.modelo + " " + m1.ano + " " + "no valor de R$" + df.format(m1.preco) + " (dezoito mil e quinhentos)");
//        System.out.println(m1);
    }
}

