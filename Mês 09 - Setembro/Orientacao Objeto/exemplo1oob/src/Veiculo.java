public class Veiculo {
    String marca;
    String modelo;
    String placa;
    int ano;
    double preco;

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", ano=" + ano +
                ", preco=" + preco +
                '}';
    }
}
