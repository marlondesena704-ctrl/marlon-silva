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

    public void setVelocidadeCarro(int velocidadeCarro) {
        if (velocidadeCarro < 0) {
            throw new IllegalArgumentException("A velocidade do carro não pode ser negativa.");
        }
        this.velocidadeCarro = velocidadeCarro;
    }




    public void Acelerar(int acelerar) {
        if (acelerar < 0 || acelerar > 20) {
            throw new IllegalArgumentException("Aceleração inválida.");
        }
        setVelocidadeCarro(velocidadeCarro + acelerar);
    }

    public void Desacelerar(int desacelerar) {
        if (desacelerar < 0 || desacelerar > 30) {
            throw new IllegalArgumentException("Desaceleração inválida.");
        }
        setVelocidadeCarro(velocidadeCarro - desacelerar);
    }
}
