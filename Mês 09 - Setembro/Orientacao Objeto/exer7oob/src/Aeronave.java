public class Aeronave {

    String modelo;
    int passageiros;
    double velocidadeMaxima;
    double capacidadeMaxima;
    double queimaCombustivelPorMinuto;

    public Aeronave(String modelo, int passageiros, double velocidadeMaxima, double capacidadeMaxima, double queimaCombustivelMinuto) {
        this.modelo = modelo;
        this.passageiros = passageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.capacidadeMaxima = capacidadeMaxima;
        this.queimaCombustivelPorMinuto = queimaCombustivelMinuto;
        }

    public double maisTempoNoAr(){
        return this.capacidadeMaxima / this.queimaCombustivelPorMinuto;
    }
    public double voarMaisLonge(){
        double tempoHoras = this.maisTempoNoAr()/60;
        return this.velocidadeMaxima * tempoHoras;
    }
}
