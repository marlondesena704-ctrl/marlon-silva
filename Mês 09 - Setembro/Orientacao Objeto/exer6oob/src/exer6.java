public class exer6 {
    public static void main(String[] args) {

        // Blumenau
        Mercado unidadeDeBlumenau = new Mercado("Supermercado Redeverde Blumenau", 262, 1.99, 375, 2.90);

        // Joinville
        Mercado unidadeDeJoinville = new Mercado("Supermercado Redeverde Joinville", 367, 3.99, 525, 2.70);

        // Florianópolis
        Mercado unidadeDeFlorianopolis = new Mercado("Supermercado Redeverde Florianópolis", 420, 5.69, 600, 4.98);

        Mercado mercados[] = {unidadeDeBlumenau, unidadeDeJoinville, unidadeDeFlorianopolis};

        // Quem teve a maior receita vendendo maçãs
        double maiorReceitaMacas = 0;
        Mercado mercadoMaiorReceitaMacas = null;

        for (int i = 0; i < mercados.length; i++) {
            if (mercados[i].calcularReceitaMacas() > maiorReceitaMacas) {
                maiorReceitaMacas = mercados[i].calcularReceitaMacas();
                mercadoMaiorReceitaMacas = mercados[i];
            }
        }
        assert mercadoMaiorReceitaMacas != null;

        System.out.println("\n");
        System.out.print(mercadoMaiorReceitaMacas.nome + " faturou R$" + maiorReceitaMacas + "\n");

        // Quem teve a menor receita vendendo laranjas
        double menorReceitaLaranjas = Double.MAX_VALUE;
        Mercado mercadoMenorReceitaLaranja = null;

        for (int i = 0; i < mercados.length; i++) {
            if (mercados[i].calcularReceitaLaranjas() < menorReceitaLaranjas) {
                menorReceitaLaranjas = mercados[i].calcularReceitaLaranjas();
                mercadoMenorReceitaLaranja = mercados[i];
            }
        }
        assert mercadoMenorReceitaLaranja != null;
        System.out.print(mercadoMenorReceitaLaranja.nome + " faturou R$" + menorReceitaLaranjas);


        // Qual das lojas teve a segunda maior receita
        double segundaMaiorReceita = 0;
        Mercado mercadoSegundaMaiorReceita = null;
        double maiorReceitaTotal = 0;

        for (int i = 0; i < mercados.length; i++) {
            if (mercados[i].calcularReceita() > maiorReceitaTotal) {
                maiorReceitaTotal = mercados[i].calcularReceita();
            }
        }
        for (int i = 0; i < mercados.length; i++) {
            if (mercados[i].calcularReceita() > segundaMaiorReceita && mercados[i].calcularReceita() != maiorReceitaTotal) {
                segundaMaiorReceita = mercados[i].calcularReceita();
                mercadoSegundaMaiorReceita = mercados[i];

            }
        }
        System.out.print("\nMercado com a segunda maior receita: " + mercadoSegundaMaiorReceita.nome + "\n");


        // A franquia teve uma
        double receitaGeralMacas = 0;
        double receitaGeralLaranjas = 0;

        for (int i = 0; i < mercados.length; i++) {
            receitaGeralMacas += mercados[i].calcularReceitaMacas();
            receitaGeralLaranjas += mercados[i].calcularReceitaLaranjas();
        }
        if (receitaGeralMacas > receitaGeralLaranjas) {
            System.out.print("A franquia teve uma receita maior com maçãs");
        } else if (receitaGeralLaranjas > receitaGeralMacas) {
            System.out.print("A franquia teve uma receita maior com laranjas");
        } else {
            System.out.print("As receitas foram iguais");
        }
        System.out.println("\n");
        System.out.print(unidadeDeBlumenau);
        System.out.println("\n");
        System.out.println(unidadeDeJoinville);
        System.out.println("\n");
        System.out.println(unidadeDeFlorianopolis);

    }
}
