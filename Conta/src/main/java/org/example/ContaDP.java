package org.example;

public class ContaDP extends Conta {

    public ContaDP (String nome,int conta, double saldo_inicial){
        super(nome,conta,saldo_inicial);
    }

    public void Aplicar (double saldo_inicial) {
       if ( saldo_inicial >= 100d) {

           Double SaldoDP =  saldo_inicial;

         System.out.println("Deposito aplicado com sucesso " + SaldoDP);
       }else {
           System.out.println("Não é possível afectuar a  aplicação");
       }
    }
}
