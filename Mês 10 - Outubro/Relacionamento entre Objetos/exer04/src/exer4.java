public class exer4 {
    public static void main(String[] args) {
        Produto p3 = new Produto("Tigre", "Cano PVC 100mm", 89.90, 40);
        Produto p4 = new Produto("Tigre", "Caixa d'Água 500L", 450.00, 5);
        Produto p5 = new Produto("Amanco", "Joelho 90 Graus", 12.50, 80);
        Produto p6 = new Produto("Amanco", "Registro de Pressão", 120.00, 15);
        Produto p7 = new Produto("Votoran", "Saco de Cimento 50kg", 35.00, 100);
        Produto p8 = new Produto("Coral", "Tinta Acrílica 18L", 320.00, 12);
        Produto p9 = new Produto("Tramontina", "Carrinho de Mão", 189.90, 10);

        MateriaisConstrucao produto = new MateriaisConstrucao();

        produto.adicionaProduto(p3);
        produto.adicionaProduto(p4);
        produto.adicionaProduto(p5);
        produto.adicionaProduto(p6);
        produto.adicionaProduto(p7);
        produto.adicionaProduto(p8);
        produto.adicionaProduto(p9);

        System.out.println(produto.produtoMaisCaro("tigre"));
        System.out.println(produto.todosProdutosMarca("amanco", 10,1000));










    }
}
