import java.util.ArrayList;
import java.util.List;

public class FormasGeometricas {

    private List<Retangulo> retangulos;

    public FormasGeometricas() {
        retangulos = new ArrayList<Retangulo>();
    }

    public void adicionarRetangulo(Retangulo r) {
        retangulos.add(r);
    }

    public Retangulo maiorArea() {
        double maiorArea = Double.MIN_VALUE;
        Retangulo rMaiorArea = null;

        for (Retangulo r : retangulos) {
            if (r.calcularArea() > maiorArea) {
                maiorArea = r.calcularArea();
                rMaiorArea = r;
            }
        }
        return rMaiorArea;
    }
    public Retangulo maioPerimetro(){
        double maiorPerimetro = Double.MIN_VALUE;
        Retangulo rMaiorPerimetro = null;

        for(Retangulo r : retangulos){
            if(r.cacularPerimetro()>maiorPerimetro){
                maiorPerimetro = r.cacularPerimetro();
                rMaiorPerimetro = r;

            }
        }
        return rMaiorPerimetro;
    }
}




