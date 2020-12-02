package Ex01;

public class Assalariado extends Empregado{
    private double salarioMensal;

    public Assalariado(String nome, String sobrenome, String cpf, double salarioMensal) {
        super(nome, sobrenome, cpf);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public String toString() {
        return ("\nEmpregado: Assalariado\n" +
                "Nome: " + getNome() + " " + getSobrenome() + "\n" +
                "CPF: " + getCpf() + "\n" + "Salário mensal: " + this.salarioMensal + "\n");
    }

    @Override
    public double ganhos() {
        return salarioMensal;
    }

    public double getSalarioMensal() { return salarioMensal; }

    public void setSalarioMensal(double salarioMensal) { this.salarioMensal = salarioMensal; }
}
