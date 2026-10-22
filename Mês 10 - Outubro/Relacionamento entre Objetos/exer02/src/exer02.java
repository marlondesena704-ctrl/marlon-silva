public class exer02 {
    public static void main(String[] args) {
        Flor f1 = new Flor("Vitor", 29.90, "Rosa");
        Flor f2 = new Flor("Carlos", 99.90,"Cravo");
        Flor f3 = new Flor("Cleber", 39.90, "Girassol");
        Flor f4 = new Flor("Maria", 45.99, "Lirio");
        Flor f5 = new Flor("Vitor",77.99, "Vitoria regia");
        Flor f6 = new Flor("Vitor", 56.90, "Margarida");

        Floricultura flor = new Floricultura();

        flor.adicionarFlor(f1);
        flor.adicionarFlor(f2);
        flor.adicionarFlor(f3);
        flor.adicionarFlor(f4);
        flor.adicionarFlor(f5);
        flor.adicionarFlor(f6);

        System.out.println(flor.floresCliente("Vitor"));



    }
}
