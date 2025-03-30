package parte02_conceitos_basicos.exercicio_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Calculadora de Impostos ---");

        System.out.print("Insira seu salário mensal para calcular o imposto devido: ");
        double salarioMensal = sc.nextDouble();

        Imposto imposto = new Imposto(salarioMensal);

        imposto.exibirInformacoes();

        sc.close();
    }
}
