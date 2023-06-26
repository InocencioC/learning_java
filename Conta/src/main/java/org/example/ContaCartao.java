package org.example;

public class ContaCartao extends Conta {

    public ContaCartao(String nome, int conta, double saldo_inicial)
    {
        super("antonio",1,100d);
    }
    public void Pagar (double saldo_inicial){
       double valorPagamento = 50;
    if (valorPagamento <= saldo_inicial) {
        saldo_inicial = saldo_inicial - valorPagamento;
        System.out.println("Pagamento efectuado com sucesso " + valorPagamento);
    }else {
        System.out.println("Não foi possível efectuar o pagamento");
    }
  }
}

