class Funcionario {
    String identificacao;
    String nome;
    String sobrenome;
    double salario;

    public double calcularSalarioAnual() {
        return salario * 12;
    }

    public String obterNomeCompleto() {
        return nome + " " + sobrenome;
    }

    public double modificarSalario(double porcentagem) {
        double valorAumento = salario * (porcentagem/100);
        return salario + valorAumento;
    }
}

