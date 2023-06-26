// Classe principal Animal
class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println("O animal emitiu um som.");
    }

    public void mover() {
        System.out.println("O animal está se movendo.");
    }
}

// Subclasse Cachorro
class Cachorro extends Animal {
    private String som;

    public Cachorro(String nome, int idade, String som) {
        super(nome, idade);
        this.som = som;
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro faz o som: " + som);
    }

    @Override
    public void mover() {
        System.out.println("O cachorro está correndo.");
    }
}

// Subclasse Cavalo
class Cavalo extends Animal {
    private String som;

    public Cavalo(String nome, int idade, String som) {
        super(nome, idade);
        this.som = som;
    }

    @Override
    public void emitirSom() {
        System.out.println("O cavalo faz o som: " + som);
    }

    @Override
    public void mover() {
        System.out.println("O cavalo está galopando.");
    }
}

// Subclasse Vaca
class Vaca extends Animal {
    private String som;

    public Vaca(String nome, int idade, String som) {
        super(nome, idade);
        this.som = som;
    }

    @Override
    public void emitirSom() {
        System.out.println("A vaca faz o som: " + som);
    }

    @Override
    public void mover() {
        System.out.println("A vaca está andando.");
    }
}

// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex", 3, "Au au");
        cachorro.emitirSom();
        cachorro.mover();

        Animal cavalo = new Cavalo("Pé de Pano", 5, "Relincho");
        cavalo.emitirSom();
        cavalo.mover();

        Animal vaca = new Vaca("Mimosa", 4, "Muuu");
        vaca.emitirSom();
        vaca.mover();
    }
}
