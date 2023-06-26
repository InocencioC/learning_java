package org.example;
import java.util.Scanner;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String nome, int conta, double saldo_inicial){
        super(nome,conta,saldo_inicial);

    }

    public void sacar(double valor){
        if(valor +2 <= saldo ){
            saldo -= valor +2;
            saques++;
            System.out.println("Sacado: " + valor);
            System.out.println("Novo saldo: " + saldo + "\n");
        } else {
            System.out.println("Saldo insuficiente. Faça um depósito\n");
        }
    }

}
