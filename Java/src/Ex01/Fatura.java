package Ex01;

public class Fatura implements Pagavel{
    private String numero;
    private String descricao;
    private int quantidade;
    private double preco;

    public Fatura(String numero, String descricao, int quatidade, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quatidade;
        this.preco = preco;
    }

    @Override
    public double getValorPagto() {
        return 0.0;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descriacao) {
        this.descricao = descriacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}