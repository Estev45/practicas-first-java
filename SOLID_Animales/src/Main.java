
// S: Una clase, una responsabilidad
class Perro {
    public void hacerSonido() {
        System.out.println("Guau guau 🐶");
    }
}

class Pato {
    public void hacerSonido() {
        System.out.println("Cuac cuac 🦆");
    }
}

// O y D: Usamos una interfaz para poder extender sin modificar
interface Animal {
    void hacerSonido();
}

class Gato implements Animal {
    public void hacerSonido() {
        System.out.println("Miau 🐱");
    }
}

class Perico implements Animal {
    public void hacerSonido() {
        System.out.println("Piiip piiip 🦜");
    }
}

// Clase que trabaja con la abstracción (no importa qué animal sea)
class Zoologico {
    private Animal animal;

    public Zoologico(Animal animal) {
        this.animal = animal;
    }

    public void presentarAnimal() {
        animal.hacerSonido();
    }
}

// Uso
public class Main {
    public static void main(String[] args) {
        Zoologico zoo1 = new Zoologico(new Gato());
        zoo1.presentarAnimal();

        Zoologico zoo2 = new Zoologico(new Perico());
        zoo2.presentarAnimal();
    }
}
