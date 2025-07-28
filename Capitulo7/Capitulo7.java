class Animal {
    void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Gato extends Animal {
    void hacerSonido() {
        System.out.println("El gato dice: Miau");
    }

    public static void main(String[] args) {
        Animal miAnimal = new Gato();
        miAnimal.hacerSonido();
    }
}
