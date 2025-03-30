package parte03_classes_e_objetos.exercicio_07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[3];

        System.out.println("--- Gerenciador de Aluno ---");
        System.out.print("Insira o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Insira o número da matrícula: ");
        int matricula = sc.nextInt();

        System.out.println("Insira as notas: ");
        for(int i = 0;i < 3; i++){
            System.out.printf("Nota %d: ", i + 1);
            notas[i] = sc.nextDouble();
        }

        Aluno aluno = new Aluno(nome, matricula, notas);

        aluno.exibirInformacoes();

        sc.close();
    }
}
