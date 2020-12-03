package Ex01;

public class Menu {
    public static void main(String[] args) {

        int[] folhaPagamento;

        Assalariado malukoAssalariado01 = new Assalariado("Tadeu", "Silva", "123.456.789-00", 1500.00);
        Horista malukoHorista01 = new Horista("Jorge", "Cleberson", "123.456.789.11", 25.00, 150);
        Comissionado malukoComissionado01 = new Comissionado("Valter", "Oliveira", "123.456.789.22", 25000.00,10);


        System.out.println(malukoHorista01.toString());
    }
}
