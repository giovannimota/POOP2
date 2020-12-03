package Ex01;

public class Menu {
    public static void main(String[] args) {
        Empregado folhaPag[][] = new Empregado[12][4];
        Empregado empregados[] = new Empregado[4];

        Assalariado malukoAssalariado01 = new Assalariado("Tadeu", "Silva", "123.456.789-00");
        Comissionado malukoComissionado01 = new Comissionado("Valter", "Oliveira", "123.456.789.11");
        Horista malukoHorista01 = new Horista("Jorge", "Cleberson", "123.456.789.22");
        BaseComissionado malukoBaseComissionado01 = new BaseComissionado("Jeferson", "Rocha", "123.456.789-33");

        empregados[0] = malukoAssalariado01;
        empregados[1] = malukoComissionado01;
        empregados[2] = malukoHorista01;
        empregados[3] = malukoBaseComissionado01;

        //Valores Fixos
        malukoAssalariado01.setSalarioMensal(1200.00);
        malukoComissionado01.setPercComissao(10);
        malukoHorista01.setValorHora(20.00);
        malukoBaseComissionado01.setSalarioBase(1400.00);
        malukoBaseComissionado01.setPercComissao(10);

        //Valores Alterados Mensalmente
        malukoComissionado01.setVendasMensal(20000.00);
        malukoHorista01.setHorasTrab(180);
        malukoBaseComissionado01.setVendasMensal(6500.00);
        for (int j=0; j<4; j++){
            folhaPag[0][j] = empregados[j];
        }
        System.out.println("Janeiro");
        System.out.println("Valor recebido 01: " + folhaPag[0][0].ganhos());
        System.out.println("Valor recebido 02: " + folhaPag[0][1].ganhos());
        System.out.println("Valor recebido 03: " + folhaPag[0][2].ganhos());
        System.out.println("Valor recebido 04: " + folhaPag[0][3].ganhos());

        //Valores Alterados Mensalmente
        malukoComissionado01.setVendasMensal(20000.00);
        malukoHorista01.setHorasTrab(180);
        malukoBaseComissionado01.setVendasMensal(6500.00);
        for (int j=0; j<4; j++){
            folhaPag[1][j] = empregados[j];
        }
        System.out.println("\nFevereiro");
        System.out.println("Valor recebido 01: " + folhaPag[1][0].ganhos());
        System.out.println("Valor recebido 02: " + folhaPag[1][1].ganhos());
        System.out.println("Valor recebido 03: " + folhaPag[1][2].ganhos());
        System.out.println("Valor recebido 04: " + folhaPag[1][3].ganhos());

        //Valores Alterados Mensalmente
        malukoComissionado01.setVendasMensal(19000.00);
        malukoHorista01.setHorasTrab(175);
        malukoBaseComissionado01.setVendasMensal(6000.00);
        for (int j=0; j<4; j++){
            folhaPag[2][j] = empregados[j];
        }
        System.out.println("\nMarço");
        System.out.println("Valor recebido 01: " + folhaPag[1][0].ganhos());
        System.out.println("Valor recebido 02: " + folhaPag[1][1].ganhos());
        System.out.println("Valor recebido 03: " + folhaPag[1][2].ganhos());
        System.out.println("Valor recebido 04: " + folhaPag[1][3].ganhos());
        System.out.println(malukoHorista01.toString());

        //Valores Alterados Mensalmente
        malukoComissionado01.setVendasMensal(20000.00);
        malukoHorista01.setHorasTrab(180);
        malukoBaseComissionado01.setVendasMensal(6500.00);
        for (int j=0; j<4; j++){
            folhaPag[3][j] = empregados[j];
        }
        System.out.println("Abril");
        System.out.println("Valor recebido 01: " + folhaPag[0][0].ganhos());
        System.out.println("Valor recebido 02: " + folhaPag[0][1].ganhos());
        System.out.println("Valor recebido 03: " + folhaPag[0][2].ganhos());
        System.out.println("Valor recebido 04: " + folhaPag[0][3].ganhos());

        //Valores Alterados Mensalmente
        malukoComissionado01.setVendasMensal(20000.00);
        malukoHorista01.setHorasTrab(180);
        malukoBaseComissionado01.setVendasMensal(6500.00);
        for (int j=0; j<4; j++){
            folhaPag[4][j] = empregados[j];
        }
        System.out.println("\nMaio");
        System.out.println("Valor recebido 01: " + folhaPag[1][0].ganhos());
        System.out.println("Valor recebido 02: " + folhaPag[1][1].ganhos());
        System.out.println("Valor recebido 03: " + folhaPag[1][2].ganhos());
        System.out.println("Valor recebido 04: " + folhaPag[1][3].ganhos());

        //Valores Alterados Mensalmente
        malukoComissionado01.setVendasMensal(19000.00);
        malukoHorista01.setHorasTrab(175);
        malukoBaseComissionado01.setVendasMensal(6000.00);
        for (int j=0; j<4; j++){
            folhaPag[5][j] = empregados[j];
        }
        System.out.println("\nJunho");
        System.out.println("Valor recebido 01: " + folhaPag[1][0].ganhos());
        System.out.println("Valor recebido 02: " + folhaPag[1][1].ganhos());
        System.out.println("Valor recebido 03: " + folhaPag[1][2].ganhos());
        System.out.println("Valor recebido 04: " + folhaPag[1][3].ganhos());
        System.out.println(malukoHorista01.toString());

        //Valores Alterados Mensalmente
        malukoComissionado01.setVendasMensal(20000.00);
        malukoHorista01.setHorasTrab(180);
        malukoBaseComissionado01.setVendasMensal(6500.00);
        for (int j=0; j<4; j++){
            folhaPag[6][j] = empregados[j];
        }
        System.out.println("Julho");
        System.out.println("Valor recebido 01: " + folhaPag[0][0].ganhos());
        System.out.println("Valor recebido 02: " + folhaPag[0][1].ganhos());
        System.out.println("Valor recebido 03: " + folhaPag[0][2].ganhos());
        System.out.println("Valor recebido 04: " + folhaPag[0][3].ganhos());

        //Valores Alterados Mensalmente
        malukoComissionado01.setVendasMensal(20000.00);
        malukoHorista01.setHorasTrab(180);
        malukoBaseComissionado01.setVendasMensal(6500.00);
        for (int j=0; j<4; j++){
            folhaPag[7][j] = empregados[j];
        }
        System.out.println("\nAgosto");
        System.out.println("Valor recebido 01: " + folhaPag[1][0].ganhos());
        System.out.println("Valor recebido 02: " + folhaPag[1][1].ganhos());
        System.out.println("Valor recebido 03: " + folhaPag[1][2].ganhos());
        System.out.println("Valor recebido 04: " + folhaPag[1][3].ganhos());

        //Valores Alterados Mensalmente
        malukoComissionado01.setVendasMensal(19000.00);
        malukoHorista01.setHorasTrab(175);
        malukoBaseComissionado01.setVendasMensal(6000.00);
        for (int j=0; j<4; j++){
            folhaPag[8][j] = empregados[j];
        }
        System.out.println("\nSetembro");
        System.out.println("Valor recebido 01: " + folhaPag[1][0].ganhos());
        System.out.println("Valor recebido 02: " + folhaPag[1][1].ganhos());
        System.out.println("Valor recebido 03: " + folhaPag[1][2].ganhos());
        System.out.println("Valor recebido 04: " + folhaPag[1][3].ganhos());
        System.out.println(malukoHorista01.toString());

        //Valores Alterados Mensalmente
        malukoComissionado01.setVendasMensal(20000.00);
        malukoHorista01.setHorasTrab(180);
        malukoBaseComissionado01.setVendasMensal(6500.00);
        for (int j=0; j<4; j++){
            folhaPag[9][j] = empregados[j];
        }
        System.out.println("Outubro");
        System.out.println("Valor recebido 01: " + folhaPag[0][0].ganhos());
        System.out.println("Valor recebido 02: " + folhaPag[0][1].ganhos());
        System.out.println("Valor recebido 03: " + folhaPag[0][2].ganhos());
        System.out.println("Valor recebido 04: " + folhaPag[0][3].ganhos());

        //Valores Alterados Mensalmente
        malukoComissionado01.setVendasMensal(20000.00);
        malukoHorista01.setHorasTrab(180);
        malukoBaseComissionado01.setVendasMensal(6500.00);
        for (int j=0; j<4; j++){
            folhaPag[10][j] = empregados[j];
        }
        System.out.println("\nNovembro");
        System.out.println("Valor recebido 01: " + folhaPag[1][0].ganhos());
        System.out.println("Valor recebido 02: " + folhaPag[1][1].ganhos());
        System.out.println("Valor recebido 03: " + folhaPag[1][2].ganhos());
        System.out.println("Valor recebido 04: " + folhaPag[1][3].ganhos());

        //Valores Alterados Mensalmente
        malukoComissionado01.setVendasMensal(19000.00);
        malukoHorista01.setHorasTrab(175);
        malukoBaseComissionado01.setVendasMensal(6000.00);
        for (int j=0; j<4; j++){
            folhaPag[11][j] = empregados[j];
        }
        System.out.println("\nDezembro");
        System.out.println("Valor recebido 01: " + folhaPag[1][0].ganhos());
        System.out.println("Valor recebido 02: " + folhaPag[1][1].ganhos());
        System.out.println("Valor recebido 03: " + folhaPag[1][2].ganhos());
        System.out.println("Valor recebido 04: " + folhaPag[1][3].ganhos());

        System.out.println(empregados[0].toString());
        System.out.println(empregados[1].toString());
        System.out.println(empregados[2].toString());
        System.out.println(empregados[3].toString());
    }
}