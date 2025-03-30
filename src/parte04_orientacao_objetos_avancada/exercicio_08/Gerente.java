package parte04_orientacao_objetos_avancada.exercicio_08;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario(){
        return salarioBase * 1.2;
    }
}
