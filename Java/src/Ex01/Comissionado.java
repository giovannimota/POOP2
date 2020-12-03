package Ex01;

public class Comissionado extends Empregado{
    private double vendasMensal;
    private double percComissao;

    public Comissionado(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
    }

    @Override
    public String toString() {
        return ("\nEmpregado: Comissionado\n" +
                "Nome: " + getNome() + " " + getSobrenome() + "\n" +
                "CPF: " + getCpf() + "\n" +
                "Salario: " + ganhos() + "\n");
    }

    @Override
    public double ganhos() {
        return vendasMensal * percComissao / 100;
    }

    public double getVendasMensal() { return vendasMensal; }

    public void setVendasMensal(double vendasMensal) { this.vendasMensal = vendasMensal; }

    public double getPercComissao() { return percComissao; }

    public void setPercComissao(double percComissao) { this.percComissao = percComissao; }
}