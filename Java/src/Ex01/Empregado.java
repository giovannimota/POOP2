package Ex01;

public class Empregado implements Pagavel{
    private String nome;
    private String sobrenome;
    private String cpf;

    public Empregado(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    @Override
    public double getValorPagto() {
        return 0.0;
    }

    @Override
    public String toString() {
        return ("Nome: " + this.nome + " " + this.sobrenome + " - CPF: " + this.cpf);
    }

    public double ganhos() {
        return 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}