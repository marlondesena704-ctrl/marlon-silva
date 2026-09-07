public class Usuario {

    String nome;
    char sexo;
    String dataNascimento;
    String estadoCivil;

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", sexo=" + sexo +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}
