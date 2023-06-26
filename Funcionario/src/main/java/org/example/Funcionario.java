package org.example;
import java.util.Scanner;

public class Funcionario {


    private String nomeFunc;
    private double salarioSemanal;
    private double totalVendas = 0;

    Scanner entra = new Scanner(System.in);

    //construtor
    public void SalarioFuncionario(String nomeFunc, double salarioSemanal){
        this.nomeFunc = nomeFunc;
        this.salarioSemanal = salarioSemanal;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    public double getTotalVendas(){
        return totalVendas;
    }

    //calcular o total vendido pelo funcion�rio
    public void setTotalVendas(){

        //int controlador = 1;
        int contador = 0;
        //double totalVendas = 0;
        System.out.println("Para cadastrar �tens vendidos digite 1 e para encerrar digite 0: "); //pode ser digitado qualquer valor para continuar. Mas deixei assim s� a t�tulo
        //de estudo
        int controlador = entra.nextInt();
        while (controlador != 0){
            System.out.println("Informe o valor da mercadoria: ");
            double valorMercadoria = entra.nextDouble();
            this.totalVendas += valorMercadoria;
            contador++;
            System.out.println("�tem            valor");
            System.out.println(contador + "               " + valorMercadoria );
            System.out.println();
            System.out.println("Para continuar inserindo valores digite 1, para encerrar digite 0.");
            controlador = entra.nextInt();
            System.out.println();
        }
    }
    //calcula a comiss�o
    public double calcComissao(){
        double comissao = this.totalVendas * 0.09;
        return comissao;
    }
    //calcula sal�rio final acrescido de comiss�o
    public double calcSalario(){
        double salarioFinal = getSalarioSemanal() + calcComissao();
        return salarioFinal;
    }

    //double salarioFinal = calcSalario();
    //mostra os dados
    public void exibirDados(){
        System.out.println("Usando o printf para exibir:");
        System.out.printf("Nome do Funcion�rio: %s%nSal�rio semanal: %.2f reais%nTotal de vendas: %.2f reais%nValor comiss�o: %.2f reais%nSal�rio final: %.2f reais%n",
                getNomeFunc(),getSalarioSemanal(), getTotalVendas(), calcComissao(), calcSalario());
        System.out.println();

        System.out.println("Usando o println para exibir:");
        System.out.println();
        System.out.println("Nome do Funcion�rio: " + getNomeFunc());
        System.out.println("Sal�rio semanal: " + getSalarioSemanal());
        System.out.println("Total Vendido: " + getTotalVendas());
        System.out.println("Comiss�o: " + calcComissao());
        System.out.println("Sal�rio Final: " + calcSalario());
        System.out.println("Programa encerrado!");
    }

}//fim da classe
