import java.text.DecimalFormat;

public class exer3 {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "Caderno";
        produto1.descricao = "Caderno em espiral tamanho médio";
        produto1.preco = 4.50;
        produto1.desconto = 15;

        Produto produto2 = new Produto();
        produto2.nome = "Caneta ESF";
        produto2.descricao = "Caneta esferográfica 5mm";
        produto2.preco = 1.20;
        produto2.desconto = 2;

        Produto produto3 = new Produto();
        produto3.nome = "Esquadro";
        produto3.descricao = "Esquadro de acrílico 20cm";
        produto3.preco = 2.35;
        produto3.desconto = 10;

        System.out.println(produto1);
        System.out.println("\n");
        System.out.println(produto2);
        System.out.println("\n");
        System.out.println(produto3);
    }
}
