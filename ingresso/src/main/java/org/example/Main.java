package org.example;

public class Main {

    class Ingresso {
        protected double valor;

        public Ingresso(double valor) {
            this.valor = valor;
        }

        public String toString() {
            return "Ingresso com valor: AOA" + String.format("%.2f", valor);
        }
    }

    class IngressoVIP extends Ingresso {
        private double valorAdicional;

        public IngressoVIP(double valor, double valorAdicional) {
            super(valor);
            this.valorAdicional = valorAdicional;
        }

        public String toString() {
            double valorTotal = valor + valorAdicional;
            return "Ingresso VIP com valor total: AOA" + String.format("%.2f", valorTotal);
        }
    }

    // Classe de teste
    public class TesteIngresso {
        public void main(String[] args) {
            Ingresso ingresso1 = new Ingresso(50.0);
            System.out.println(ingresso1);

            IngressoVIP ingresso2 = new IngressoVIP(40.0, 30.0);
            System.out.println(ingresso2);
        }
    }
}