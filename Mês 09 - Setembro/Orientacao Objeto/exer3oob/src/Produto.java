public class Produto {
    String nome;
    String descricao;
    double preco;
    int desconto;

    @Override
    public String toString() {
        return "Produto {" +
                "nome ='" + nome + '\'' +
                ", descrição ='" + descricao + '\'' +
                ", preço = R$" + preco +
                ", desconto = " + desconto + "%" +
                '}';
    }
}
