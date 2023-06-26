package org.example;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.examinar(new Cao());
        main.examinar(new Cavalo());
    }

    public <T extends Animal> void examinar(T animal) {
        if (animal instanceof Cao) {
            System.out.println("AIIIIIII");
        } else if (animal instanceof Cavalo) {
            System.out.println("AAGGGGGG");
        }
    }

    public static class Animal {
        // A definição da classe Animal seria necessária aqui
    }

    public static class Cao extends Animal {
        public void emitirSom() {
            System.out.println("AHUUUUU");
        }

        public String toString() {
            return "Cachorro";
        }
    }

    public static class Cavalo extends Animal {
        public void emitirSom() {
            System.out.println("Relinchar");
        }

        public String toString() {
            return "Cavalo";
        }
    }
}
