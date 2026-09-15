public class exer7 {
    public static void main(String[] args) {

        Aeronave aero1 = new Aeronave("Alpha",50, 500, 1000, 10);
        Aeronave aero2 = new Aeronave("Beta",120, 600, 2500, 25);
        Aeronave aero3 = new Aeronave("Charlie",30, 800, 1800, 15);
        Aeronave aero4 = new Aeronave("Delta",200, 450, 3000, 40);

        Aeronave[] aero = {aero1, aero2, aero3, aero4};

        // Qual aeronave leva o maior número de passageiros?
        int maiorNumeroPassageiros = 0; // ou int maiorNumeroPassageiros = aero[0];
        Aeronave aeronaveMaisPassageiros = null;
        for (int i = 0; i<aero.length;i++) {
            if(aero[i].passageiros>maiorNumeroPassageiros){
                maiorNumeroPassageiros = aero[i].passageiros;
                aeronaveMaisPassageiros = aero[i];
            }
        }
        assert aeronaveMaisPassageiros != null;
        System.out.println("Aeronave com a maior capacidade de passageiros: " + aeronaveMaisPassageiros.modelo + "\nNúmero de passageiros suportados: " + maiorNumeroPassageiros + "\n");

        // Qual das aeronaves pode ficar mais tempo no ar?
        double maisTempoAr = 0;
        Aeronave aeronaveMaisTempoAr = null;
        for (int i = 0; i<aero.length;i++) {
            if(aero[i].maisTempoNoAr()>maisTempoAr){
                maisTempoAr = aero[i].maisTempoNoAr();
                aeronaveMaisTempoAr = aero[i];
            }
        }
        assert aeronaveMaisTempoAr != null;
        System.out.println("Aeronave capaz de ficar mais tempo no ar: " + aeronaveMaisTempoAr.modelo + "\nTempo total: " + maisTempoAr + " minutos\n");

        // Qual deles consegue voar mais longe? (Considerando que estão em velocidade máxima)
        double voarMaisLonge = 0;
        Aeronave aeronaveMaisLonge = null;
        for (int i = 0; i<aero.length;i++) {
            if(aero[i].voarMaisLonge()>voarMaisLonge) {
                voarMaisLonge = aero[i].voarMaisLonge();
                aeronaveMaisLonge = aero[i];
            }
        }
        assert aeronaveMaisLonge != null;
        System.out.println("Aeronave capaz de voar mais longe: " + aeronaveMaisLonge.modelo + "\nDistância em KM: " + voarMaisLonge);
    }
}
