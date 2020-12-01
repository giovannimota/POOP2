package Ex01;

public class Comissionado extends Empregado{
    private double vendasMensal;
    private double percComissao;

    public Comissionado(String nome, String sobrenome, String cpf, double vendasMensal, double percComissao) {
        super(nome, sobrenome, cpf);
        this.vendasMensal = vendasMensal;
        this.percComissao = percComissao;
    }
}
