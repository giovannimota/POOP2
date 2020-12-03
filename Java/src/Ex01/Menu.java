package Ex01;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Empregado folhaPag[][] = new Empregado[12][4];
        Empregado empregados[] = new Empregado[4];

        Assalariado malukoAssalariado01 = new Assalariado("Tadeu", "Silva", "123.456.789-00");
        Comissionado malukoComissionado01 = new Comissionado("Valter", "Oliveira", "123.456.789.11");
        Horista malukoHorista01 = new Horista("Jorge", "Cleberson", "123.456.789.22");
        BaseComissionado malukoBaseComissionado01 = new BaseComissionado("Jeferson", "Rocha", "123.456.789-33");

        double vm1, ht1, vm2;

        empregados[0] = malukoAssalariado01;
        empregados[1] = malukoComissionado01;
        empregados[2] = malukoHorista01;
        empregados[3] = malukoBaseComissionado01;

        //Valores Fixos
        malukoAssalariado01.setSalarioMensal(1200.00);
        malukoComissionado01.setPercComissao(10);
        malukoHorista01.setValorHora(20.00);
        malukoBaseComissionado01.setSalarioBase(1300.00);
        malukoBaseComissionado01.setPercComissao(10);

        for (int i = 0; i < 3; i++) {

            //Valores Alterados Mensalmente
            System.out.println("Valor das vendas mensais do comissionado: ");
            vm1 = ler.nextDouble();
            malukoComissionado01.setVendasMensal(vm1);
            System.out.println("Horas trabalhadas do horista: ");
            ht1 = ler.nextDouble();
            malukoHorista01.setHorasTrab(ht1);
            System.out.println("Valor das vendas mensais do base comissionado: ");
            vm2 = ler.nextDouble();
            malukoBaseComissionado01.setVendasMensal(vm2);
            for (int j = 0; j < 4; j++) {
                folhaPag[i][j] = empregados[j];
            }
        }

        System.out.println("Janeiro");
        System.out.println("Valor recebido 01: " + folhaPag[0][0].ganhos());
        System.out.println("Valor recebido 02: " + folhaPag[0][1].ganhos());
        System.out.println("Valor recebido 03: " + folhaPag[0][2].ganhos());
        System.out.println("Valor recebido 04: " + folhaPag[0][3].ganhos());
/*
        //Valores Alterados Mensalmente
        malukoComissionado01.setVendasMensal(20000.00);
        malukoHorista01.setHorasTrab(180);
        malukoBaseComissionado01.setVendasMensal(6500.00);

        for (int j=0; j<4; j++){
            folhaPag[1][j] = empregados[j];
        }*/
        System.out.println("\nFevereiro");
        System.out.println("Valor recebido 01: " + folhaPag[1][0].ganhos());
        System.out.println("Valor recebido 02: " + folhaPag[1][1].ganhos());
        System.out.println("Valor recebido 03: " + folhaPag[1][2].ganhos());
        System.out.println("Valor recebido 04: " + folhaPag[1][3].ganhos());
/*
        //Valores Alterados Mensalmente
        malukoComissionado01.setVendasMensal(19000.00);
        malukoHorista01.setHorasTrab(175);
        malukoBaseComissionado01.setVendasMensal(6000.00);

        for (int j=0; j<4; j++){
            folhaPag[2][j] = empregados[j];
        }*/
        System.out.println("\nMarço");
        System.out.println("Valor recebido 01: " + folhaPag[1][0].ganhos());
        System.out.println("Valor recebido 02: " + folhaPag[1][1].ganhos());
        System.out.println("Valor recebido 03: " + folhaPag[1][2].ganhos());
        System.out.println("Valor recebido 04: " + folhaPag[1][3].ganhos());
    }
}