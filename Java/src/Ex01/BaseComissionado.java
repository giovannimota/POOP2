package Ex01;

public class BaseComissionado extends Comissionado{
    private double  salarioBase;

    public BaseComissionado(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
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
        return (this.salarioBase + (getVendasMensal() * getPercComissao())/100);
    }

    @Override
    public double getValorPagto() {
        return (0.1 * this.salarioBase);
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
