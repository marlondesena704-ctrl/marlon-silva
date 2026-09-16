public class Aeronave {

    private String modelo;
    private int passageiros;
    private double velocidadeMaxima;
    private double capacidadeMaxima;
    private double queimaCombustivelPorMinuto;

    public Aeronave(String modelo, int passageiros, double velocidadeMaxima, double capacidadeMaxima, double queimaCombustivelMinuto) {
        this.modelo = modelo;
        this.passageiros = passageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.capacidadeMaxima = capacidadeMaxima;
        this.queimaCombustivelPorMinuto = queimaCombustivelMinuto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(double capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public double getQueimaCombustivelPorMinuto() {
        return queimaCombustivelPorMinuto;
    }

    public void setQueimaCombustivelPorMinuto(double queimaCombustivelPorMinuto) {
        this.queimaCombustivelPorMinuto = queimaCombustivelPorMinuto;
    }

    @Override
    public String toString() {
        return "[" +
                "modelo: '" + modelo + '\'' +
                ", passageiros: " + passageiros +
                ", velocidade máxima: " + velocidadeMaxima +
                " km/h, capacidade máxima: " + capacidadeMaxima +
                "L, queima do combustível por minuto: " + queimaCombustivelPorMinuto +
                "L/m" + " ]";
    }

    public double maisTempoNoAr() {
        return this.capacidadeMaxima / this.queimaCombustivelPorMinuto;
    }

    public double voarMaisLonge() {
        double tempoHoras = this.maisTempoNoAr() / 60;
        return this.velocidadeMaxima * tempoHoras;
    }
}
