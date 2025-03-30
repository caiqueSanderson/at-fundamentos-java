package parte04_orientacao_objetos_avancada.exercicio_09;

public class ContaBancaria {
    protected String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0){
            this.saldo += valor;
        }else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public void sacar(double valor){
        if (valor <= saldo){
            this.saldo -= valor;
        }else{
            System.out.println("Valor de saque não permitido!");
        }
    }

    public void exibirSaldo(){
        System.out.printf("Saldo da conta: %.2f \n", saldo);
    }

}
