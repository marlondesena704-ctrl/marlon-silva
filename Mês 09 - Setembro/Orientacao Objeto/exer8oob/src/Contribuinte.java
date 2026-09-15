public class Contribuinte {

    String nome;
    String cpf;
    String uf;
    double rendaAnual;

    public Contribuinte(String nome, String cpf, String uf, double rendaAnual) {
        this.nome = nome;
        this.cpf = cpf;
        this.uf = uf;
        this.rendaAnual = rendaAnual;
    }

    @Override
    public String toString() {
        return "Contribuinte{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", uf='" + uf + '\'' +
                ", rendaAnual=" + rendaAnual +
                '}';
    }

    double aliquota = 0;
    public double impostoAPagar(){
        if(rendaAnual>=0 && rendaAnual<=4000){
            aliquota = 0;
        }else if(rendaAnual>=4001 && rendaAnual<=9000){
            aliquota = 5.8/100;
        }else if(rendaAnual>=9001 && rendaAnual<=25000){
            aliquota = (double) 15 /100;
        }else if(rendaAnual>=25001 && rendaAnual<=35000){
            aliquota = 27.5/100;
        }else{
            aliquota = (double) 30/100;
        }
        return rendaAnual*aliquota;
    }
}
