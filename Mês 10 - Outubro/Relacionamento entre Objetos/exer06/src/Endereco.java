public class Endereco {

    private String uf;
    private String cidade;
    private String cep;
    private String logradouro;
    private String numeroResidencia;

    public Endereco(String uf, String cidade, String cep, String logradouro, String numeroResidencia) {
        this.uf = uf;
        this.cidade = cidade;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numeroResidencia = numeroResidencia;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumeroResidencia() {
        return numeroResidencia;
    }

    public void setNumeroResidencia(String numeroResidencia) {
        this.numeroResidencia = numeroResidencia;
    }















    @Override
    public String toString() {
        return "Endereco{" +
                "uf='" + uf + '\'' +
                ", cidade='" + cidade + '\'' +
                ", cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", numeroResidencia=" + numeroResidencia +
                '}';
    }
}
