package parte03_classes_e_objetos.exercicio_06;

public class Main {
    public static void main(String[] args){
        Veiculo carro01 = new Veiculo("BCV3G68","Corolla",2019,5000);
        Veiculo carro02 = new Veiculo("BUSA40O","Hilux", 2020, 20000);

        carro01.exibirDetalhes();
        carro02.exibirDetalhes();

        carro01.registrarViagem(250);
        carro02.registrarViagem(470);

        carro01.exibirDetalhes();
        carro02.exibirDetalhes();
    }
}
