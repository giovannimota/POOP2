package Ex01;

public class BaseComissionado extends Comissionado{
    private double  salarioBase;

    public BaseComissionado(String nome, String sobrenome, String cpf, double vendasMensal, double percComissao, double salarioBase) {
        super(nome, sobrenome, cpf, vendasMensal, percComissao);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() { return salarioBase; }

    public void setSalarioBase(double salarioBase) { this.salarioBase = salarioBase; }
}
