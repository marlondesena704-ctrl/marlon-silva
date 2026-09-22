public class exer8 {
    public static void main(String[] args) {

        try {
            Contribuinte cb1 = new Contribuinte("Carlos", "53999987635", "SC", 50000);
            Contribuinte cb2 = new Contribuinte("Pedro", "09087955643", "RS", 60000);
            Contribuinte cb3 = new Contribuinte("Leonardo", "53993589921", "PR", 67000);
            Contribuinte cb4 = new Contribuinte("Junior", "26536784292", "SP", 20000);
            Contribuinte cb5 = new Contribuinte("Mateus", "80050039211", "MG", 70000);

            Contribuinte[] contribuinte = {cb1, cb2, cb3, cb4, cb5};

            // Quem mais paga imposto?
            double pagaMaisImposto = 0;
            Contribuinte pagaMaisImpostos = null;
            for (int i = 0; i < contribuinte.length; i++) {
                if (contribuinte[i].calcularImposto() > pagaMaisImposto) {
                    pagaMaisImposto = contribuinte[i].calcularImposto();
                    pagaMaisImpostos = contribuinte[i];
                }
            }
            System.out.println("\n");
            assert pagaMaisImpostos != null;
            System.out.println("Contribuinte que paga mais imposto: " + pagaMaisImpostos + "\nValor pago em imposto: R$" + pagaMaisImposto + "\n");

            //Qual o total de imposto pago pelos contribuintes?
            double impostoTotalPago = 0;
            for (int i = 0; i < contribuinte.length; i++) {
                impostoTotalPago += contribuinte[i].calcularImposto();
            }
            System.out.printf("Total de imposto pago pelos 5 contribuintes: R$%.2f", impostoTotalPago);

        } catch (IllegalArgumentException e) {

            System.out.println("Erro ao processar os contribuintes: " + e.getMessage());

        }
    }

}
