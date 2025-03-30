package parte05_manipulacao_arquivos_e_estruturas_avancadas.exercicio_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro usuário: ");
        String usuarioUm = sc.nextLine();

        System.out.print("Digite o nome do segundo usuário: ");
        String usuarioDois = sc.nextLine();

        System.out.println();

        int numeroMensagem = 10;
        String[] historicoMensagens = new String[numeroMensagem];

        for (int i = 0; i < numeroMensagem; i++) {
            if (i % 2 == 0) {
                System.out.printf("%s, digite sua mensagem %d: ", usuarioUm, i + 1);
                historicoMensagens[i] = sc.nextLine();
            } else {
                System.out.printf("%s, digite sua mensagem %d: ", usuarioDois, i + 1);
                historicoMensagens[i] = sc.nextLine();
            }
        }

        System.out.println("\n--- Histórico de Mensagens ---");
        for (int i = 0; i < numeroMensagem; i++) {
            if(i % 2 == 0){
                System.out.printf("%s: %s\n", usuarioUm, historicoMensagens[i]);
            }else{
                System.out.printf("%s: %s\n", usuarioDois, historicoMensagens[i]);
            }
        }

        System.out.println("Obrigado por utilizarem o sistema! Boa sorte para vocês!");

        sc.close();
    }
}
