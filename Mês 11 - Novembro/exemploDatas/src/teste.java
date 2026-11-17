import java.time.LocalDate;

public class teste {
    public static void main(String[] args) {

        usuario u1 = new usuario ("Marlon", LocalDate.of(2005,3,11));

        if(u1.verificaMaior()){
            System.out.println("É maior de idade.\n" + "Nome:" + u1.getNome()+"\n" + "Data de nascimento: " + u1.getDataNascimento());
        }else{
            System.out.println("É menor de idade\n" + "Nome:" + u1.getNome() + "Data de nascimento: " + u1.getDataNascimento());
        }



    }
}
