

public class Calculodespesas {

    public static void main (String [] args){
        double  DespesaTotalTrimestre,MediaMensal,DespesaJaneiro=15000, DespesaFevereiro= 23000,DespesaMarco=17000;

        DespesaTotalTrimestre = DespesaJaneiro + DespesaFevereiro + DespesaMarco;
        MediaMensal = DespesaTotalTrimestre / 3;

        System.out.println("Despesa total " + DespesaTotalTrimestre);
        System.out.println("Média mensal " + MediaMensal);

    }

}
