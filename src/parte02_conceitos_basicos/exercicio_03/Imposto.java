package parte02_conceitos_basicos.exercicio_03;

public class Imposto {
    private double salarioMensal;

    public Imposto(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public double getSalarioAnual() {
        return salarioMensal * 12;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public double calcularImposto() {
        double salarioAnual = getSalarioAnual();
        double imposto = 0;

        if (salarioAnual <= 22847.76) {
            imposto = 0;
        } else if (salarioAnual <= 33919.80) {
            imposto = 0.075;
        } else if (salarioAnual <= 45012.60) {
            imposto = 0.15;
        } else if (salarioAnual > 45012.61) {
            imposto = 0.275;
        }

        return imposto;
    }

    public void exibirInformacoes() {
        double salarioAnual = getSalarioAnual();
        double impostoDevido = salarioAnual * calcularImposto();
        double salarioLiquido = salarioAnual - impostoDevido;

        System.out.println("\nInformações");
        System.out.println("Salário anual: R$" + String.format("%.2f", salarioAnual));
        System.out.println("Imposto Devido: R$" + String.format("%.2f", impostoDevido));
        System.out.println("Salário Líquido: R$" + String.format("%.2f", salarioLiquido));
    }
}
