import java.lang.Math;
public class Conta {

    private String nomeTitular;
    private double saldo;

    public Conta(String nomeTitular, double saldo) {
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("saldo invalido");
        }
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        if (nomeTitular== null || nomeTitular.isBlank()) {
            throw new IllegalArgumentException("nome invalido");
        }
        this.nomeTitular = nomeTitular;
    }

    public double sacar(double valorSaque) {
        if (valorSaque > saldo) {
            throw new IllegalArgumentException("o valor informado para saque é maior do que está disponível na conta do titular.");
        } else {
            setSaldo(saldo - valorSaque);
        }
        return saldo;
    }

    public String depositar(double valorDeposito) {
        if (valorDeposito < 0 || valorDeposito > saldo) {
            throw new IllegalArgumentException("o valor a ser depositado não é valido ou é maior do que está disponivel na conta do titular.");
        } else {
            setSaldo(saldo + valorDeposito);
        }
        return "Valor depositado: R$" + valorDeposito +"\nSaldo atual: R$"+ getSaldo();
    }

    public String transferir(Conta contaDestino, double valorTransferencia) {
        if (valorTransferencia < 0 || valorTransferencia > saldo) {
            throw new IllegalArgumentException("o valor informado para transferência não é válido ou é maior do que está disponível na conta do titular.");
        }
        saldo-=valorTransferencia;
        contaDestino.saldo+=valorTransferencia;
        return "Valor transferido: R$" + valorTransferencia + "\nSaldo da conta de origem: R$" + saldo + "\n" + "Saldo atualizado da conta de destino: R$" + contaDestino.saldo;

    }
    public double simularInvestimento(double valorInvestido, int tempoInvestimentoMeses){

        double montante;
        montante = valorInvestido * Math.pow(1.01, tempoInvestimentoMeses);
        return montante;

    }

    @Override
    public String toString() {
        return "Conta{" +
                "nomeTitular='" + nomeTitular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}



