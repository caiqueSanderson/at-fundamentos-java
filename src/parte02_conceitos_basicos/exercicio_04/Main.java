package parte02_conceitos_basicos.exercicio_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int parcelas = 0;

        System.out.println("--- Simulador de Empréstimo Bancário ---");

        System.out.print("Insira seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Insira o valor do empréstimo: ");
        double valor = sc.nextDouble();

        do {
            System.out.println("Insira a quantidade de parcelas(6-48) que deseja pagar: ");
            parcelas = sc.nextInt();

            if (parcelas < 6 || parcelas > 48){
                System.out.println("Número de parcelas inválido!");
            }
        } while (parcelas < 6 || parcelas > 48);


        EmprestimoBancario emprestimo = new EmprestimoBancario(nome,valor,parcelas);
        emprestimo.exibirInformacoes();

        sc.close();
    }
}
