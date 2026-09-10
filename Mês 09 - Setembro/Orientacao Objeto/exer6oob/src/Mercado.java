public class Mercado {

    String nome;
    double quantidadeMaca;
    double precoMaca;
    double quantidadeLaranja;
    double precoLaranja;


    public Mercado(String nome, double quantidadeMaca, double precoMaca, double quantidadeLaranja, double precoLaranja) {
        this.nome = nome;
        this.quantidadeMaca = quantidadeMaca;
        this.precoMaca = precoMaca;
        this.quantidadeLaranja = quantidadeLaranja;
        this.precoLaranja = precoLaranja;
    }

    @Override
    public String toString() {
        return "Mercado: " +
                "nome ='" + nome + '\'' +
                ", quantidadeMaca = " + quantidadeMaca +
                ", precoMaca = " + precoMaca +
                ", quantidadeLaranja = " + quantidadeLaranja +
                ", precoLaranja = " + precoLaranja;
    }


    public double calcularReceitaMacas(){
        return quantidadeMaca * precoMaca;
    }
    public double calcularReceitaLaranjas(){
        return quantidadeLaranja * precoLaranja;
    }

    public double calcularReceita(){
        return calcularReceitaMacas() + calcularReceitaLaranjas();
    }
}
