public class VelocidadeCarro {
    private int velocidadeCarro;

    public int getVelocidadeCarro() {
        return velocidadeCarro;
    }

    public void setVelocidadeCarro(int velocidadeCarro) {
        if(velocidadeCarro >= 0 && velocidadeCarro < 20){
            throw new IllegalArgumentException();
        }
        this.velocidadeCarro = velocidadeCarro;
    }

    public VelocidadeCarro(int velocidadeCarro) {
        this.velocidadeCarro = velocidadeCarro;
    }

    public double Acelerar(int acelerar){
        return acelerar + getVelocidadeCarro();
    }
    public int Desacelerar(int desacelerar){
        if(desacelerar>=0 && desacelerar<30){
            throw new IllegalArgumentException();
        }
        return getVelocidadeCarro() - desacelerar;
    }
}
