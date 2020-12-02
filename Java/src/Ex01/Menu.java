package Ex01;

public class Menu {
    public static void main(String[] args) {

        int[] folhaPagamento;

        Assalariado malukoAssalariado01 = new Assalariado("Tadeu", "Silva", "123.456.789-00", 1500.00);
        Horista malukoHorista01 = new Horista("Jorge", "Cleberson", "123.456.789.11", 25.00, 150);
        Comissionado malukoComissionado01 = new Comissionado("Valter", "Oliveira", "123.456.789.22", 25000.00,10);

        Fatura divida01 = new Fatura("0123", "WaterCooler", 1, 250.00);

        System.out.println("Nome completo: " + malukoHorista01.getNome() + " " + malukoHorista01.getSobrenome());
    }
}
