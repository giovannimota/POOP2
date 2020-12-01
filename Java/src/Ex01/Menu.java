package Ex01;

public class Menu {
    public static void main(String[] args) {
        Horista maluko01 = new Horista("Jorge", "Cleberson", "123.456.789.00", 25.00, 150);
        System.out.println("Nome completo: " + maluko01.getNome() + " " + maluko01.getSobrenome());
    }
}
