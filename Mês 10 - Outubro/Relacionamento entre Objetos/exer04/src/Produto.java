public class Produto {

    private String marca;
    private String modelo;
    private double preco;
    private int quantidade;

    public Produto(String marca, String modelo, double preco, int quantidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade<=0){
            throw new IllegalArgumentException("quantidade invalida");
        }
        this.quantidade = quantidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(marca == null || marca.isBlank()){
            throw new IllegalArgumentException("marca invalida");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if(modelo == null || modelo.isBlank()){
            throw new IllegalArgumentException("modelo invalido");
        }
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco<=0){
            throw new IllegalArgumentException("preço invalido");
        }
        this.preco = preco;
    }
    public void adicionaProduto(int quant){
        quant += quantidade;
        setQuantidade(quant);
    }
    public void vendeProduto (String produto, int quantidadeVenda){
        if(quantidadeVenda > getQuantidade()){
            throw new IllegalArgumentException("a quantidade a ser vendida é maior do que há no estoque");

        }else if(quantidadeVenda <=getQuantidade()){
            quantidadeVenda -=quantidade;
            setQuantidade(quantidadeVenda);
        }

    }

}
