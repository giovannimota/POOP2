package Ex01;

public class Horista extends Empregado{
    private double valorHora;
    private double horasTrab;

    public Horista(String nome, String sobrenome, String cpf, double valorHora, double horasTrab) {
        super(nome, sobrenome, cpf);
        this.valorHora = valorHora;
        this.horasTrab = horasTrab;
    }
}
