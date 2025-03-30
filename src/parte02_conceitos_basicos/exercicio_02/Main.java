package parte02_conceitos_basicos.exercicio_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cadastro de Usuários ---");

        System.out.print("Insira seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Crie uma senha que siga as seguintes regras: ");
        System.out.println(" Ter no mínimo 8 caracteres.");
        System.out.println(" Conter pelo menos uma letra maiúscula.");
        System.out.println(" Conter pelo menos um número.");
        System.out.println(" Conter pelo menos um caractere especial (@, #, $, etc.)");

        do {
            System.out.print("Insira sua senha: ");
            String senha = sc.nextLine();

            String resultado = ValidadorSenha.validar(senha);
            if(resultado.equals("Senha válida")){
                System.out.println("Senha cadastrada com sucesso!");
                break;
            }else {
                System.out.println("Erro: " + resultado);
            }
        }while(true);

        sc.close();
    }
}
