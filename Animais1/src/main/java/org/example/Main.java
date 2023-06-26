package org.example;

import java.util.ArrayList;


    public class Main {

        class Animal {
            private String nome;
            private int idade;

            public Animal(String nome, int idade) {
                this.nome = nome;
                this.idade = idade;
            }

            public String emitirSom() {
                return "O animal emite um som.";
            }

            public int getIdade() {
                return idade;
            }
        }

        static class Leao extends Animal {
            public Leao(String nome, int idade) {
                super(nome, idade);
            }

            @Override
            public String emitirSom() {
                return "O leão ruge!";
            }
        }

        static class Elefante extends Animal {
            public Elefante(String nome, int idade) {
                super(nome, idade);
            }

            @Override
            public String emitirSom() {
                return "O elefante tromba!";
            }
        }

        static class Zoologico {
            private ArrayList<Animal> jaulas;

            public Zoologico() {
                jaulas = new ArrayList<>(10);
            }

            public void adicionarAnimal(Animal animal) {
                jaulas.add(animal);
            }

            public void percorrerJaulas() {
                for (Animal animal : jaulas) {
                    System.out.println(animal.emitirSom());
                }
            }

            public double calcularIdadeMedia() {
                int totalAnimais = jaulas.size();
                int somaIdades = 0;

                for (Animal animal : jaulas) {
                    somaIdades += animal.getIdade();
                }

                return (double) somaIdades / totalAnimais;
            }
        }

        public class main {
            public static void main(String[] args) {
                run();
            }

            public static void run() {
                Zoologico zoologico = new Zoologico();

                zoologico.adicionarAnimal(new Leao("Simba", 5));
                zoologico.adicionarAnimal(new Elefante("Dumbo", 10));

                // Adicione outros animais ao zoologico...

                zoologico.percorrerJaulas();

                double idadeMedia = zoologico.calcularIdadeMedia();
                System.out.println("Idade média dos animais: " + idadeMedia);
            }
        }

    }


