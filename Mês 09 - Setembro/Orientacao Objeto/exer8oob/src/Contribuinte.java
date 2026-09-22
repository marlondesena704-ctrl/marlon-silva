public class Contribuinte {

    private String nome;
    private String cpf;
    private String uf;
    private double rendaAnual;
    private double aliquota = 0;

    // Construtor chamando os setters
    public Contribuinte(String nome, String cpf, String uf, double rendaAnual) {
        setNome(nome);
        setCpf(cpf);
        setUf(uf);
        setRendaAnual(rendaAnual);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Erro: nome inválido.");
        }
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.isBlank() || cpf.length() != 11) {
            throw new IllegalArgumentException("Erro: CPF inválido.");
        }
        this.cpf = cpf;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        if (uf == null || uf.isBlank() || uf.length() != 2) {
            throw new IllegalArgumentException("Erro: UF inválido.");
        }
        this.uf = uf;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        if (rendaAnual < 0) {
            throw new IllegalArgumentException("A renda anual não pode ser um valor negativo.");
        }
        this.rendaAnual = rendaAnual;
    }

    public double getAliquota() {
        return aliquota;
    }

    public void setAliquota(double aliquota) {
        this.aliquota = aliquota;
    }

    private double calcularAliquota() {
        if (rendaAnual <= 4000) {
            return 0;
        } else if (rendaAnual <= 9000) {
            return 5.8 / 100;
        } else if (rendaAnual <= 25000) {
            return (double) 15 / 100;
        } else if (rendaAnual <= 35000) {
            return 27.5 / 100;
        } else {
            return (double) 30 / 100;
        }
    }

    public double calcularImposto() {
        return rendaAnual * calcularAliquota();
    }

    @Override
    public String toString() {
        return "[" +
                "Nome: '" + nome + '\'' +
                ", CPF: '" + cpf + '\'' +
                ", UF: '" + uf + '\'' +
                ", Renda anual: R$" + rendaAnual +
                "]";
    }
}