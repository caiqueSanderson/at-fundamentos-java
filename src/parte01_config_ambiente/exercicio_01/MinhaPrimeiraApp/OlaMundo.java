package parte01_config_ambiente.exercicio_01.MinhaPrimeiraApp;

import java.util.Scanner;

public class OlaMundo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Olá, meu nome é " + nome + " e estou aprendendo Java! ");
    }
}
