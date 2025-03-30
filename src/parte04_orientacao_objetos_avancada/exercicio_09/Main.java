package parte04_orientacao_objetos_avancada.exercicio_09;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Conta Bancária com Encapsulamento --- \n");
        ContaBancaria conta = new ContaBancaria("Fulano", 10000.50);

        conta.exibirSaldo();
        conta.depositar(20000);

        conta.exibirSaldo();
        conta.sacar(151.10);

        conta.exibirSaldo();
    }
}
