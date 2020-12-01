package Ex01;

public class Comissionado extends Empregado{
    private double vendasMensal;
    private double percComissao;

    public Comissionado(String nome, String sobrenome, String cpf, double vendasMensal, double percComissao) {
        super(nome, sobrenome, cpf);
        this.vendasMensal = vendasMensal;
        this.percComissao = percComissao;
    }

    @Override
    public double ganhos() {
        return vendasMensal * percComissao;
    }

    public double getVendasMensal() { return vendasMensal; }

    public void setVendasMensal(double vendasMensal) { this.vendasMensal = vendasMensal; }

    public double getPercComissao() { return percComissao; }

    public void setPercComissao(double percComissao) { this.percComissao = percComissao; }
}
