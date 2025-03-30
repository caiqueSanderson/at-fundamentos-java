package parte04_orientacao_objetos_avancada.exercicio_08;

public class Estagiario extends Funcionario{
    public Estagiario(String nome, double salarioBase){
        super(nome,salarioBase);
    }

    @Override
    public double calcularSalario(){
        return salarioBase * 0.9;
    }
}
