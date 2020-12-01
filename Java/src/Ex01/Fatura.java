package Ex01;

public class Fatura implements Pagavel{
    private String numero;
    private String descricao;
    private int quantidade;
    private double preco;

    public Fatura(String numero, String descriacao, int quatidade, double preco) {
        this.numero = numero;
        this.descricao = descriacao;
        this.quantidade = quatidade;
        this.preco = preco;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescriacao() {
        return this.descricao;
    }

    public void setDescriacao(String descriacao) {
        this.descricao = descriacao;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
