public class exer8 {
    public static void main(String[] args) {

        Contribuinte cb1 = new Contribuinte("Carlos", "539.999.876-35", "SC", 50000 );
        Contribuinte cb2 = new Contribuinte("Pedro", "090.879.556-43", "RS", 60000);
        Contribuinte cb3 = new Contribuinte("Leonardo", "539.935.899-21", "PR", 67000);
        Contribuinte cb4 = new Contribuinte("Junior", "265.367.842-92", "SP", 20000);
        Contribuinte cb5 = new Contribuinte("Mateus", "800.500.392-11", "MG", 70000);

        Contribuinte[] contribuinte = {cb1, cb2, cb3, cb4, cb5};

        // Quem mais paga imposto?
        double pagaMaisImposto = 0;
        Contribuinte pagaMaisImpostos = null;
        for(int i = 0; i< contribuinte.length; i++){
            if(contribuinte[i].impostoAPagar()> pagaMaisImposto){
                pagaMaisImposto = contribuinte[i].impostoAPagar();
                pagaMaisImpostos = contribuinte[i];
            }
        }
        System.out.println("\n");
        assert pagaMaisImpostos != null;
        System.out.println("Contribuinte que paga mais imposto: " + pagaMaisImpostos + "\nValor pago em imposto: R$" + pagaMaisImposto + "\n");

        //Qual o total de imposto pago pelos contribuintes?
        double impostoTotalPago = 0;
        for(int i = 0; i< contribuinte.length; i++){
            impostoTotalPago +=contribuinte[i].impostoAPagar();
        }
        System.out.printf("Total de imposto pago pelos 5 contribuintes: R$%.2f" , impostoTotalPago);
    }
}
