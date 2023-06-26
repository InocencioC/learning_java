package org.example;

public class ContaCorrente {

public class ContaCorrente {
    protected String cliente;
    protected double saldo;

    public ContaCorrente(String cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }
}

public class ContaEspecial extends ContaCorrente {
    private double limite;

    public ContaEspecial(String cliente, double saldo, double limite) {
        super(cliente, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (saldo + limite >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Limite de crédito insuficiente.");
        }
    }
}
}
