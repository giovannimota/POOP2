package Ex01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class Menu {

    private static double salarioMensal = 2500;
    private static double valorHora = 17.5;
    private static double percComissao = 15;
    private static double percBaseComissao = 10;

    private static int FUNCIONARIOS = 4; //Com 4 podemos testar cada tipo de empregado
    private static int MESES = 12;
    private static int FATURAS = 3;

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        Empregado[][] folhaDePagamento = new Empregado[MESES][FUNCIONARIOS];
        Fatura[][] faturas = new Fatura[MESES][FATURAS];
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        for (int mes = 0; mes < MESES; mes++) {

            Date dataDeNascimento = formato.parse("1/1/1991");
            folhaDePagamento[mes][0] = new Assalariado("Fábio", "Carvalho", "111.111.111-11",dataDeNascimento);
            ((Assalariado)folhaDePagamento[mes][0]).setSalarioMensal(salarioMensal);

            dataDeNascimento = formato.parse("2/2/1992");
            folhaDePagamento[mes][1] = new Horista("Nicolas", "Meles", "222.222.222-22",dataDeNascimento);
            ((Horista)folhaDePagamento[mes][1]).setValorHora(valorHora);
            System.out.println("----------Horista----------");
            System.out.print("Número de horas trabalhadas do funcionário " + folhaDePagamento[mes][1].getNome() + " no mês de " + mesAtual(mes) + ": ");
            ((Horista)folhaDePagamento[mes][1]).setHorasTrab(sc.nextDouble());
            System.out.println();

            dataDeNascimento = formato.parse("3/3/1993");
            folhaDePagamento[mes][2] = new Comissionado("Joana", "Moreira", "333.333.333-33",dataDeNascimento);
            ((Comissionado)folhaDePagamento[mes][2]).setPercComissao(percComissao);
            System.out.println("\n----------Comissionado----------");
            System.out.print("Valor das vendas do funcionário " + folhaDePagamento[mes][2].getNome() + " no mês de " + mesAtual(mes) + ": ");
            ((Comissionado)folhaDePagamento[mes][2]).setVendasMensal(sc.nextDouble());
            System.out.println();


            dataDeNascimento = formato.parse("4/4/1994");
            folhaDePagamento[mes][3] = new BaseComissionado("Márcia", "Rezende", "444.444.444-44", dataDeNascimento);
            ((BaseComissionado)folhaDePagamento[mes][3]).setSalarioBase(salarioMensal);
            ((BaseComissionado)folhaDePagamento[mes][3]).setPercComissao(percBaseComissao);
            System.out.println("\n-----------Base Comissionado----------");
            System.out.print("Valor das vendas do funcionário " + folhaDePagamento[mes][3].getNome() + " no mês de " + mesAtual(mes) + ": ");
            ((BaseComissionado)folhaDePagamento[mes][3]).setVendasMensal(sc.nextDouble());
            System.out.println();

            System.out.print("\nNúmero de faturas que serão adicionadas no mês de " + mesAtual(mes) + " (máximo: " + FATURAS + "): ");
            int numero_faturas  = sc.nextInt();

            for(int idFatura = 0; idFatura < numero_faturas; idFatura++) {
                faturas[mes][idFatura] = new Fatura();
                System.out.print("\n***********Preechimento de informações da fatura************\n");
                System.out.println("Mês - " + mesAtual(mes));
                System.out.println("ID Fatura - #F0" + (idFatura+1));
                System.out.print("\nDescrição: ");
                faturas[mes][idFatura].setDescricao(sc.nextLine());
                System.out.print("\nNúmero da fatura: ");
                faturas[mes][idFatura].setNumero(sc.nextLine());
                System.out.print("Quantidade: ");
                faturas[mes][idFatura].setQuantidade(sc.nextInt());
                System.out.print("Preço: ");
                faturas[mes][idFatura].setPreco(sc.nextDouble());
            }
        }

        exibirFolhaDePagamento(folhaDePagamento, faturas);

    }

    public static String mesAtual(int mes){

        if(mes == 0){
            return "Janeiro";
        }else if(mes == 1){
            return "Fevereiro";
        }else if(mes == 2){
            return "Março";
        }else if(mes == 3){
            return "Abril";
        }else if(mes == 4){
            return "Maio";
        }else if(mes == 5){
            return "Junho";
        }else if(mes == 6){
            return "Julho";
        }else if(mes == 7){
            return "Agosto";
        }else if(mes == 8){
            return "Setembro";
        }else if(mes == 9){
            return "Outubro";
        }else if(mes == 10){
            return "Novembro";
        }else{
            return "Dezembro";
        }
    }

    public static void exibirFolhaDePagamento(Empregado[][] folhaDePagamento, Fatura[][] faturas){

        for(int mes = 0; mes < MESES; mes++){
            System.out.println("\n**********" + mesAtual(mes) + "**********");
            for(int funionario = 0; funionario < folhaDePagamento[mes].length; funionario++){

                //Converte Date em LocalDate, assim pegando os meses e transformando em números
                LocalDate localDate = folhaDePagamento[mes][funionario].getDataNasc().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

                if(localDate.getMonth().getValue() == (mes+1)) {
                    System.out.print(folhaDePagamento[mes][funionario].toString());
                    System.out.println("Pagamento extra pelo mês de aniversário: " + (folhaDePagamento[mes][funionario].getValorPagto()+200));
                }else{
                    System.out.println(folhaDePagamento[mes][funionario].toString());
                }
            }

            System.out.println("***************Informações da fatura do mês de " + mesAtual(mes) + "***************");

            for(int idFatura = 0; idFatura < faturas[mes].length; idFatura++){
                if(faturas[mes][idFatura] != null) {
                    System.out.println("Número da fatura: " + faturas[mes][idFatura].getNumero());
                    System.out.println("Descrição: " + faturas[mes][idFatura].getDescricao());
                    System.out.println("Valor da fatura: " + faturas[mes][idFatura].getValorPagto());
                }
            }
        }
    }

}