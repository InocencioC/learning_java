package org.example;

public class banco {
    public static void main(String[] args) {
        Conta inocencio = new Conta( "inocencio",1,100d);
        inocencio.extrato();
        inocencio.sacar(10d);
        inocencio.extrato();


        ContaPoupanca renan = new ContaPoupanca( "renan",2,200d);
        renan.extrato();
        renan.sacar(10d);
        renan.extrato();

        ContaPoupanca jose = new ContaPoupanca("jose",3,1d);
        jose.sacar(1d);
        jose.extrato();

        ContaDP joao = new ContaDP("joao", 4,200d);
        joao.extrato();
        joao.Aplicar(joao.saldo);

        ContaCartao luis = new ContaCartao("luis", 5,100d);
        luis.extrato();
        luis.Pagar(100d);
        luis.extrato();

    }
}
