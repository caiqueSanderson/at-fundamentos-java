package parte04_orientacao_objetos_avancada.exercicio_08;

public class Main {
    public static void main(String[] args){
        System.out.println("--- Sistema de Funcionários ---");

        Funcionario gerente = new Gerente("Riquinho", 1000000000);
        Funcionario estagiario = new Estagiario("Fulaninho", 1500.12);

        gerente.exibirInformacoes();
        estagiario.exibirInformacoes();
    }
}
