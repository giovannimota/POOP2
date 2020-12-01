package Ex01;

public class Horista extends Empregado{
    private double valorHora;
    private double horasTrab;

    public Horista(String nome, String sobrenome, String cpf, double valorHora, double horasTrab) {
        super(nome, sobrenome, cpf);
        this.valorHora = valorHora;
        this.horasTrab = horasTrab;
    }

    public double getValorHora() { return valorHora; }

    public void setValorHora(double valorHora) { this.valorHora = valorHora; }

    public double getHorasTrab() { return horasTrab; }

    public void setHorasTrab(double horasTrab) { this.horasTrab = horasTrab; }
}
