package Ex01;

public class Assalariado extends Empregado{
    private double salarioMensal;

    public Assalariado(String nome, String sobrenome, String cpf, double salarioMensal) {
        super(nome, sobrenome, cpf);
        this.salarioMensal = salarioMensal;
    }
}
