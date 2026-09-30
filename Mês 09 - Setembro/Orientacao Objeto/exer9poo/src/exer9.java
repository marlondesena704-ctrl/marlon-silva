public class exer9 {
    public static void main(String[] args) {
        VelocidadeCarro c1 = new VelocidadeCarro(77);
        System.out.println("Velocidade atual do carro: " + c1.getVelocidadeCarro() + "km/h");

        System.out.println("Carro desacelerando... " );
        c1.Desacelerar(6);
        System.out.println("Carro acelera novamente " );
        c1.Acelerar(8);
        System.out.println("Velociade atual: " + c1.getVelocidadeCarro() + "km/h");
    }

}
