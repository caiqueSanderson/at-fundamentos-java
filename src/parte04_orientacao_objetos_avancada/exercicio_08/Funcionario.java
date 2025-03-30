package parte04_orientacao_objetos_avancada.exercicio_08;

public class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario(){
        return salarioBase;
    }

    public void exibirInformacoes(){
        System.out.println("\nInformações Funcionário");
        System.out.println("Funcionário: " + nome);
        System.out.printf("Salário Final: R$%.2f\n", calcularSalario());
    }
}
