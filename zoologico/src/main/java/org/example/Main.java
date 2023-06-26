package org.example;

import java.util.ArrayList;

class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println("O animal " + nome + " está emitindo som.");
    }

    public int getIdade() {
        return idade;
    }
}

class Zoologico {
    private ArrayList<Animal> jaulas;

    public Zoologico() {
        jaulas = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        jaulas.add(animal);
    }

    public void percorrerJaulas() {
        for (Animal animal : jaulas) {
            animal.emitirSom();
        }
    }

    public double calcularIdadeMedia() {
        int somaIdades = 0;
        for (Animal animal : jaulas) {
            somaIdades += animal.getIdade();
        }

        return (double) somaIdades / jaulas.size();
    }
}

public class Main {
    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico();

        // Adicionando animais às jaulas
        zoologico.adicionarAnimal(new Animal("Leão", 5));
        zoologico.adicionarAnimal(new Animal("Tigre", 7));
        zoologico.adicionarAnimal(new Animal("Girafa", 10));
        zoologico.adicionarAnimal(new Animal("Elefante", 15));
        zoologico.adicionarAnimal(new Animal("Macaco", 3));
        zoologico.adicionarAnimal(new Animal("Cobra", 2));
        zoologico.adicionarAnimal(new Animal("Zebra", 6));
        zoologico.adicionarAnimal(new Animal("Urso", 8));
        zoologico.adicionarAnimal(new Animal("Lobo", 4));
        zoologico.adicionarAnimal(new Animal("Rinoceronte", 12));

        // Percorrendo as jaulas e emitindo o som de cada animal
        zoologico.percorrerJaulas();

        // Calculando a idade média dos animais
        double idadeMedia = zoologico.calcularIdadeMedia();
        System.out.println("Idade média dos animais: " + idadeMedia);
    }
}
