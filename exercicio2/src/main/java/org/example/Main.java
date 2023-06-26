package org.example;

// Classe Empregado
class Empregado {
    private String nome;
    protected double salario;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Salário: " + salario;
    }
}

// Classe Gerente
class Gerente extends Empregado {
    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        this.setNome(nome);
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + ", Departamento: " + departamento;
    }
}

// Classe Vendedor
class Vendedor extends Empregado {
    private float percentualComissao;

    public Vendedor(String nome, double salario, float percentualComissao) {
        this.setNome(nome);
        this.salario = salario;
        this.percentualComissao = percentualComissao;
    }

    public float getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(float percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public double calcularSalario() {
        return salario + (salario * percentualComissao / 100);
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Salário sem comissão: " + salario + ", Salário com comissão: " + calcularSalario() + ", Percentual de comissão: " + percentualComissao + "%";
    }
}


