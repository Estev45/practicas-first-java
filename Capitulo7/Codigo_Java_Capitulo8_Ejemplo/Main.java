
// Archivo: Main.java
public class Main {
    public static void main(String[] args) {
        Animal miAnimal = new Animal();
        Animal miPerro = new Perro();
        Animal miGato = new Gato();

        miAnimal.hacerSonido(); // Algún sonido genérico
        miPerro.hacerSonido();  // Guau guau!
        miGato.hacerSonido();   // Miau miau!
    }
}
