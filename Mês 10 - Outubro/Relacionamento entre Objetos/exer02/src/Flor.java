public class Flor {

    private String nomeFlor;
    private double preco;
    private String nomeCliente;

    public Flor(String nomeCliente, double preco, String nomeFlor) {
        this.nomeCliente = nomeCliente;
        this.preco = preco;
        this.nomeFlor = nomeFlor;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        if (nomeCliente == null || nomeCliente.isBlank()) {
            throw new IllegalArgumentException("nome do cliente invalido");
        }
        this.nomeCliente = nomeCliente;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco <= 0){
            throw new IllegalArgumentException("preço invalido");
        }
        this.preco = preco;
    }

    public String getNomeFlor() {
        return nomeFlor;
    }

    public void setNomeFlor(String nomeFlor) {
        if(nomeFlor == null || nomeFlor.isBlank()){
            throw new IllegalArgumentException("nome da flor invalido");
        }
        this.nomeFlor = nomeFlor;
    }

    @Override
    public String toString() {
        return "Flor{" +
                "nomeFlor='" + nomeFlor + '\'' +
                ", preco=" + preco +
                ", nomeCliente='" + nomeCliente + '\'' +
                '}';
    }
}
