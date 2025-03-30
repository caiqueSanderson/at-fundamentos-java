package parte05_manipulacao_arquivos_e_estruturas_avancadas.exercicio_10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main {
    private static final String ARQUIVO_COMPRAS = "compras.txt";

    public static void main(String[] args) {
        criarArquivo();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Insira o nome do produto: ");
            String produto = sc.nextLine();

            System.out.print("Insira a quantidade: ");
            int quantidade = sc.nextInt();

            System.out.print("Insira o preço unitário: ");
            double precoUnitario = sc.nextDouble();

            System.out.println();
            sc.nextLine();

            Compra compra = new Compra(produto, quantidade, precoUnitario);
            salvarCompra(compra);
        }

        sc.close();
    }

    private static void salvarCompra(Compra compra) {
        Path arquivo = Path.of(ARQUIVO_COMPRAS);
        String conteudo = compra.toString() + System.lineSeparator();

        try {
            Files.writeString(arquivo, conteudo, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Erro ao salvar compra: " + e.getMessage());
        }
    }

    private static void criarArquivo() {
        Path arquivo = Path.of(ARQUIVO_COMPRAS);
        try {
            if (!Files.exists(arquivo)) {
                Files.createFile(arquivo);
                System.out.println("Arquivo criado: " + arquivo.toAbsolutePath());
            } else {
                System.out.println("Arquivo já existe: " + arquivo.toAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo: " + e.getMessage());
        }
    }
}
