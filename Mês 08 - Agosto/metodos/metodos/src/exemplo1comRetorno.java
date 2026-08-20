public class exemplo1comRetorno {
    public static void main(String[] args) {

        System.out.println(multiplicarNumero(7,9)+calcularNumeroAoQuadradro(8));

    }
    public static double multiplicarNumero (int num1,int num2){

//        double res = num1*num2;
//        return res;
        return num1*num2;
    }
    public static double calcularNumeroAoQuadradro(double valor){

        return Math.pow(valor, 2);
    }
}

