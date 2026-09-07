public class exer5 {
    public static void main(String[] args) {

        Funcionario f = new Funcionario();
        f.identificacao = "945845";
        f.nome = "Marcelo";
        f.sobrenome = "Lima";
        f.salario = 5000;

        System.out.println("Nome do funcionário: " + f.obterNomeCompleto());
        System.out.printf("Salário: R$%.2f\n" , f.salario );
        System.out.printf("Salário anual: R$%.2f\n" , f.calcularSalarioAnual());
        System.out.printf("Salário com aumento: R$%.2f" , f.modificarSalario(10));

    }
}
