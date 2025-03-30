package parte05_manipulacao_arquivos_e_estruturas_avancadas.exercicio_11;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        Set<Integer> numerosSorteados = new HashSet<>();
        while (numerosSorteados.size() < 6){
            numerosSorteados.add(random.nextInt(60) + 1);
        }

        Set<Integer> numerosUsuario = new HashSet<>();

        System.out.println("--- Simulação de Loteria ---");

        System.out.println("Insira 6 números entre 1 e 60");
        while(numerosUsuario.size() < 6){
            System.out.printf("Insira o número %d escolhido: ", numerosUsuario.size() + 1);
            int numero = sc.nextInt();
            if (numero < 1 || numero > 60){
                System.out.println("Número inválido! Digite um número entre 1 e 60.");
            }else if (!numerosUsuario.add(numero)){
                System.out.println("Número repetido! Insira um número repetido.");
            }

            System.out.printf("Falta você inserir %d números: %s\n", numerosUsuario.size(), numerosUsuario);
        }

        Set<Integer> acertos = new HashSet<>(numerosUsuario);
        acertos.retainAll(numerosSorteados);

        System.out.println("Números sorteados: " + numerosSorteados);
        System.out.println("Números escolhidos: " + numerosUsuario);
        if (acertos.size() > 0){
            System.out.println("Você acertou " + acertos.size() + " número(s): " + acertos);
        }else {
            System.out.println("Você não acertou nenhum número!");
        }

        sc.close();
    }
}
