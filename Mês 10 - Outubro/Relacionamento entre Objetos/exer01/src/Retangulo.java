public class Retangulo {

    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        setAltura(altura);
        setLargura(largura);
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if(largura <= 0){
            throw new IllegalArgumentException("largura invalida");
        }
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura <= 0){
            throw new IllegalArgumentException("altura invalida");
        }
        this.altura = altura;
    }
    public double calcularArea(){
        return largura * altura;
    }
    public double cacularPerimetro(){
        return (altura * largura) * 2;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "altura=" + altura +
                ", largura=" + largura +
                '}';
    }
}
