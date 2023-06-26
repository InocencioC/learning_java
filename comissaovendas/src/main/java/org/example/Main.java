package org.example;



public class Main {
    public static void main(String[] args) {

         String nomeFunc;
         double salarioSemanal;
         double totalVendas = 0, item1=239.99,item2=129.75,item3=99.95,item4=350.89, comissaoSemanal=200,valorToal,
                 ValorTotalSemanalBruto=0,media=0;
         float comissaoPercentagem= 9;


         System.out.println("Valor do primeiro item " +item1);
         System.out.println("Valor do segundo item " +item2);
         System.out.println("Valor do terceiro item " +item3);
         System.out.println("Valor do quarto item " +item4);
        System.out.println("----------------------------------------------------------" );
         ValorTotalSemanalBruto = item1 + item2 + item3 + item4;

        System.out.println("Valor total dos items na última semana " +ValorTotalSemanalBruto);
        System.out.println("Comissão semanal " +comissaoSemanal);
        comissaoPercentagem = (float) (9 * ValorTotalSemanalBruto ) / 100;
        System.out.println("----------------------------------------------------------" );
        System.out.println("Valor total ganhos em comissões do valor total ganho " +comissaoPercentagem);
        valorToal = comissaoSemanal + comissaoPercentagem + ValorTotalSemanalBruto;
        System.out.println("Soma de todos os valores ganhos " +valorToal);

    }
}