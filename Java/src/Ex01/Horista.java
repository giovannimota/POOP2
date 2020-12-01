package Ex01;

public class Horista extends Empregado{
    private double valorHora;
    private double horasTrab;

    public Horista(String nome, String sobrenome, String cpf, double valorHora, double horasTrab) {
        super(nome, sobrenome, cpf);
        this.valorHora = valorHora;
        this.horasTrab = horasTrab;
    }

    @Override
    public double ganhos() {
        if (horasTrab <= 160) {
            return  valorHora * horasTrab;
        }

        double horaExtra;

        horaExtra = horasTrab - 160;

        return (valorHora * 160) + (horaExtra * 1.5 * valorHora);
    }

    public double getValorHora() { return valorHora; }

    public void setValorHora(double valorHora) { this.valorHora = valorHora; }

    public double getHorasTrab() { return horasTrab; }

    public void setHorasTrab(double horasTrab) { this.horasTrab = horasTrab; }
}
