package org.example;

public class TestClasses {
    public static void main(String[] args) {
        // Testando as classes
        Empregado empregado = new Empregado();
        empregado.setNome("João");
        empregado.setSalario(2000.0);
        System.out.println("Empregado: " + empregado.toString());

        Gerente gerente = new Gerente("Maria", 3000.0, "RH");
        System.out.println("Gerente: " + gerente.toString());

        Vendedor vendedor = new Vendedor("Pedro", 1500.0, 10.0f);
        System.out.println("Vendedor: " + vendedor.toString());
    }

}
