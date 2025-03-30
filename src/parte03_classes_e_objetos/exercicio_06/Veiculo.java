package parte03_classes_e_objetos.exercicio_06;

public class Veiculo {
    private String placa;
    private String modelo;
    private int anoFabricacao;
    private double quilometragem;

    public double getQuilometragem(){
        return quilometragem;
    }
    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public Veiculo(String placa, String modelo, int anoFabricacao, double quilometragem){
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = quilometragem;
    }

    public void exibirDetalhes(){
        System.out.println("\nDetalhes");
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Quilometragem: " + quilometragem);
    }

    public void registrarViagem(double km){
        double kmTotal = quilometragem + km;
        setQuilometragem(kmTotal);
    }
}
