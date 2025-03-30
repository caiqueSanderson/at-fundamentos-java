package parte03_classes_e_objetos.exercicio_07;

public class Aluno {
    private String nome;
    private int matricula;
    private double[] notas;

    public Aluno(String nome, int matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public String verificarAprovacao() {
        double media = calcularMedia();
        String status = "Em Análise";

        if (media >= 7) {
            status = "Status: Aprovado!";
        } else {
            status = "Status: Reprovado!";
        }

        return status;
    }

    public void exibirInformacoes(){
        double media = calcularMedia();
        String status = verificarAprovacao();

        System.out.println("\nDetalhes Aluno");
        System.out.printf("Aluno: %s\nMatrícula: %s\nMédia: %.2f\n",nome, matricula, media);
        System.out.println(verificarAprovacao());
    }
}
