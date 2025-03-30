package parte05_manipulacao_arquivos_e_estruturas_avancadas.exercicio_10;

public class Compra {
    private String produto;
    private int quantidade;
    private double precoUnitario;

    public Compra(String produto, int quantidade, double precoUnitario){
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public String getProduto(){
        return produto;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public double getPrecoUnitario(){
        return precoUnitario;
    }

    @Override
    public String toString(){
        return "Nome: " + produto + " | " + "Quantidade: " + quantidade + " | " + "Preço Unitário: R$" + String.format("%.2f", precoUnitario);
    }

}
