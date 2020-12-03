package Ex01;

public class Assalariado extends Empregado{

    public Assalariado(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
    }
    private double salarioMensal;
    @Override
    public String toString() {
        return ("\nEmpregado: Assalariado\n" +
                "Nome: " + getNome() + " " + getSobrenome() + "\n" +
                "CPF: " + getCpf() + "\n" + "Salário mensal: " + this.salarioMensal + "\n");
    }

    @Override
    public double ganhos() {
        return this.salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
