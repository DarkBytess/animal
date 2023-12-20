class Animal {
    public void fazerSom() {
        System.out.println("Animal fazendo som genérico.");
    }
}


class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Cachorro latindo: Au au!");
    }
}


class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Gato miando: Miau!");
    }
}


public class TestePolimorfismo {
    public static void main(String[] args) {
        Animal animal1 = new Cachorro();
        Animal animal2 = new Gato();

        animal1.fazerSom();
        animal2.fazerSom();

        Animal animal3 = obterAnimalAleatorio();
        animal3.fazerSom();
    }


    public static Animal obterAnimalAleatorio() {
        if (Math.random() < 0.5) {
            return new Cachorro();
        } else {
            return new Gato();
        }
    }
}


    
