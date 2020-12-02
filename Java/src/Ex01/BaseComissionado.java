package Ex01;

public class BaseComissionado extends Comissionado{
    private double  salarioBase;

    public BaseComissionado(String nome, String sobrenome, String cpf, double vendasMensal, double percComissao, double salarioBase) {
        super(nome, sobrenome, cpf, vendasMensal, percComissao);
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return ("Empregado: Assalariado Comissionado\n" +
                "Nome: " + getNome() + " " + getSobrenome() + "\n" +
                "CPF: " + getCpf() + "\n" +
                "Salário: " + ganhos() + "\n");
    }

    @Override
    public double ganhos() {
        return (salarioBase + (getVendasMensal() * getPercComissao()));
    }

    @Override
    public double getValorPagto() {
        return (0.1 * this.salarioBase);
    }

    public double getSalarioBase() { return salarioBase; }

    public void setSalarioBase(double salarioBase) { this.salarioBase = salarioBase; }
}
