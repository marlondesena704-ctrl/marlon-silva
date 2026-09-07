public class exer1 {
    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "Riccardo";
        u1.sexo = 'M';
        u1.dataNascimento = "11/03/2005";
        u1.estadoCivil = "Solteiro";

        Usuario u2 = new Usuario();
        u2.nome = "Claire";
        u2.sexo = 'F';
        u2.dataNascimento = "31/03/2005";
        u2.estadoCivil = "Solteira";

        System.out.println(u1);
        System.out.println(u2);

    }
}
