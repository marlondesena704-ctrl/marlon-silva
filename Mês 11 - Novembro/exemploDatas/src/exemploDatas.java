import java.time.LocalDate;

public class exemploDatas {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();

        System.out.println(hoje);

        LocalDate dataNascimentoCarlos = LocalDate.of(2007, 8, 20);

        LocalDate dataNascimentoMarlon = LocalDate.of(2005,3,11);

        if(dataNascimentoMarlon.isBefore(dataNascimentoCarlos)){
            System.out.println("Marlon é mais novo.\n" + "Data de nascimento: " + dataNascimentoMarlon);
        }else{
            System.out.println("Carlos é mais novo.\n" + "Data de nascimento: " + dataNascimentoCarlos);
        }


    }
}
