public class VelocidadeCarro {
    private int velocidadeCarro;

    public VelocidadeCarro(int velocidadeCarro) {
        this.velocidadeCarro = velocidadeCarro;
    }
    @Override
    public String toString() {
        return "VelocidadeCarro{" +
                "velocidadeCarro=" + velocidadeCarro +
                '}';
    }

    public int getVelocidadeCarro() {
        return velocidadeCarro;
    }

    public int setVelocidadeCarro(int velocidadeCarro) {
        if (velocidadeCarro < 0) {
            throw new IllegalArgumentException("A velocidade do carro não pode ser negativa.");
        }
        this.velocidadeCarro = velocidadeCarro;
        return velocidadeCarro;
    }


    public int Acelerar(int acelerar) {
        if (acelerar < 0 || acelerar > 20) {
            throw new IllegalArgumentException("Aceleração inválida.");
        }
        return setVelocidadeCarro(velocidadeCarro+acelerar);
    }



    public int Desacelerar(int desacelerar) {
        if (desacelerar >= 0 && desacelerar < 30) {
            throw new IllegalArgumentException();
        }
        return setVelocidadeCarro(velocidadeCarro-desacelerar);
    }
}
