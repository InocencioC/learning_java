package org.example;


// Exemplo de uso das classes
public class Main {

        public class ContaCorrente {
            protected int numeroConta;
            protected double saldo;

            public ContaCorrente(int numeroConta, double saldo) {
                this.numeroConta = numeroConta;
                this.saldo = saldo;
            }

            public void depositar(double valor) {
                saldo += valor;
            }

            public boolean sacar(double valor) {
                if (saldo >= valor) {
                    saldo -= valor;
                    return true;
                } else {
                    return false;
                }
            }
        }

        public class ContaEspecial extends ContaCorrente {
            private double limite;

            public ContaEspecial(int numeroConta, double saldo, double limite) {
                super(numeroConta, saldo);
                this.limite = limite;
            }

            @Override
            public boolean sacar(double valor) {
                if (saldo + limite >= valor) {
                    saldo -= valor;
                    return true;
                } else {
                    return false;
                }
            }
        }

    }

