package parte02_conceitos_basicos.exercicio_04;

public class EmprestimoBancario {
    private String cliente;
    private double valor;
    private int parcelas;
    private final double JUROS_MENSAL = 0.03;

    public EmprestimoBancario(String cliente, double valor, int parcelas) {
        this.cliente = cliente;
        this.valor = valor;
        this.parcelas = parcelas;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public double calcularValorTotal() {
        return valor * Math.pow(1 + JUROS_MENSAL, parcelas);
    }

    public double calcularParcelaMensal() {
        return calcularValorTotal() / parcelas;
    }

    public void exibirInformacoes() {
        double totalPago = calcularValorTotal();
        double valorParcela = calcularParcelaMensal();

        System.out.println("\nInformações");
        System.out.println("Cliente: " + cliente);
        System.out.println("Valor Solicitado: R$" + String.format("%.2f", valor));
        System.out.println("Parcelas: " + parcelas + " meses");
        System.out.println("Valor Total Pago: R$" + String.format("%.2f", totalPago));
        System.out.println("Valor da Parcela Mensal: R$" + String.format("%.2f", valorParcela));
    }
}
