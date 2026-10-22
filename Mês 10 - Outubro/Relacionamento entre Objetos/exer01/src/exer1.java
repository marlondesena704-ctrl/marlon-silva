public class exer1 {
    public static void main(String[] args) {

        Retangulo r1 = new Retangulo(12,6);
        Retangulo r2 = new Retangulo(5, 9);
        Retangulo r3 = new Retangulo(8,10);
        Retangulo r4 = new Retangulo(6, 7);

        FormasGeometricas fg = new FormasGeometricas();

        fg.adicionarRetangulo(r1);
        fg.adicionarRetangulo(r2);
        fg.adicionarRetangulo(r3);
        fg.adicionarRetangulo(r4);

        System.out.println(fg.maiorArea());
        System.out.println(fg.maioPerimetro());



    }
}
