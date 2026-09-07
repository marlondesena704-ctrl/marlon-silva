public class UnidadeDeBlumenau {
    public static void main(String[] args) {

        // Blumenau
        Mercado unidadeDeBlumenau = new Mercado();
        unidadeDeBlumenau.nome = "Supermercado Redeverde Blumenau";
        unidadeDeBlumenau.quantidadeMaca = 262500;
        unidadeDeBlumenau.precoMaca = 15.99;
        unidadeDeBlumenau.quantidadeLaranja = 375000;
        unidadeDeBlumenau.precoLaranja = 22.90;

        // Joinville
        Mercado unidadeDeJoinville = new Mercado();
        unidadeDeJoinville.nome = "Supermercado Redeverde Joinville";
        unidadeDeJoinville.quantidadeMaca = 367500;
        unidadeDeJoinville.precoMaca = 15.99;
        unidadeDeJoinville.quantidadeLaranja = 525000;
        unidadeDeJoinville.precoLaranja = 22.90;

        // Florianópolis
        Mercado unidadeDeFlorianopolis = new Mercado();
        unidadeDeFlorianopolis.nome = "Supermercado Redeverde Florianópolis";
        unidadeDeFlorianopolis.quantidadeMaca = 420000;
        unidadeDeFlorianopolis.precoMaca = 15.99;
        unidadeDeFlorianopolis.quantidadeLaranja = 600000;
        unidadeDeFlorianopolis.precoLaranja = 22.90;


        // ================= IMPRESSÃO BLUMENAU =================
        System.out.println("=========================================");
        System.out.println("        " + unidadeDeBlumenau.nome);
        System.out.println("=========================================");
        System.out.println("Quantidade de maçãs vendidas no ano: " + unidadeDeBlumenau.quantidadeMaca + " (duzentos e sessenta e dois mil e quinhentos)");
        System.out.printf("Preço por kg da maçã: R$%.2f%n", unidadeDeBlumenau.precoMaca);

        System.out.println("-----------------------------------------");

        System.out.println("Quantidade de laranjas vendidas no ano: " + unidadeDeBlumenau.quantidadeLaranja + " (trezentos e setenta e cinco mil)");
        System.out.printf("Preço por kg da laranja: R$%.2f%n", unidadeDeBlumenau.precoLaranja);
        System.out.println("=========================================\n");


        // ================= IMPRESSÃO JOINVILLE =================
        System.out.println("=========================================");
        System.out.println("        " + unidadeDeJoinville.nome);
        System.out.println("=========================================");
        System.out.println("Quantidade de maçãs vendidas no ano: " + unidadeDeJoinville.quantidadeMaca + " (trezentos e sessenta e sete mil e quinhentos)");
        System.out.printf("Preço por kg da maçã: R$%.2f%n", unidadeDeJoinville.precoMaca);

        System.out.println("-----------------------------------------");

        System.out.println("Quantidade de laranjas vendidas no ano: " + unidadeDeJoinville.quantidadeLaranja + " (quinhentos e vinte e cinco mil)");
        System.out.printf("Preço por kg da laranja: R$%.2f%n", unidadeDeJoinville.precoLaranja);
        System.out.println("=========================================\n");


        // ================= IMPRESSÃO FLORIANÓPOLIS =================
        System.out.println("=========================================");
        System.out.println("        " + unidadeDeFlorianopolis.nome);
        System.out.println("=========================================");
        System.out.println("Quantidade de maçãs vendidas no ano: " + unidadeDeFlorianopolis.quantidadeMaca + " (quatrocentos e vinte mil)");
        System.out.printf("Preço por kg da maçã: R$%.2f%n", unidadeDeFlorianopolis.precoMaca);

        System.out.println("-----------------------------------------");

        System.out.println("Quantidade de laranjas vendidas no ano: " + unidadeDeFlorianopolis.quantidadeLaranja + " (seiscentos mil)");
        System.out.printf("Preço por kg da laranja: R$%.2f%n", unidadeDeFlorianopolis.precoLaranja);
        System.out.println("=========================================");
    }
}