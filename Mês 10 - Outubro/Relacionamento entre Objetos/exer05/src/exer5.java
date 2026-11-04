public class exer5 {
    public static void main(String[] args) {
        Conta c1 = new Conta("Marcio", 2000);
        Conta c2 = new Conta("Carlos", 4699);
        Conta c3 = new Conta("Junior", 0);
        Conta c4 = new Conta("Pedro", 22);

        System.out.println(c1.depositar(200));
        System.out.println(c4.transferir(c3,5));
    }

}
