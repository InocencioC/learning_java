package org.example;

public class Main {
        public static void main(String[] args) {
                // criar um funcionário
                Funcionario funcionario = new Funcionario();

                // instanciar um objeto processamento com os valores de IRT, SS e salariobase
                Processamento processamentoFuncionario = new Processamento(funcionario, 100.00, 50.00, 500.00);

                // calcular e mostrar o salário líquido do funcionário
                System.out.println("Salário líquido do funcionário " + processamentoFuncionario.nomeCompleto() + ": KZ" + processamentoFuncionario.mostrarSalarioLiquido());
        }
}
