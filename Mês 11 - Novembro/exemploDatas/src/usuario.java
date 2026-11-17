import java.time.LocalDate;
import java.time.Period;

public class usuario {

    private String nome;
    private LocalDate dataNascimento;

    public usuario(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido.");
        }
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        if (dataNascimento == null || dataNascimento.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Data de nascimento inválida.");

        }
        this.dataNascimento = dataNascimento;
    }

    public boolean verificaMaior() {
        return Period.between(dataNascimento, LocalDate.now()).getYears()>=18;

    }
}


