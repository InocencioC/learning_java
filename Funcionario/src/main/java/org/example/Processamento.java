package org.example;

public class processamento {

    public processamento(Funcionario _funcionario, double irt, double ss, double salariobase){
        this.xfuncioario = _funcionario;
        this.IRT = irt;
        this.SS = ss;
        this.salarioBase = salariobase;
    }
    private Funcionario xfuncioario;
    private double salarioBase;
    private double IRT;
    private double SS;

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getIRT() {
        return IRT;
    }

    public void setIRT(double IRT) {
        this.IRT = IRT;
    }

    public double getSS() {
        return SS;
    }

    public void setSS(double SS) {
        this.SS = SS;
    }

    public double getSalarioLiquido(){
        return xfuncioario.getSalario() + getSalarioBase();
    }

    public double MostrarSalarioLiquido(){
        return xfuncioario.getSalario() + getSalarioBase();
    }
    public String nomeCompleto(){

        return xfuncioario.getNome() + xfuncioario.getSobrenome();
    }

}
