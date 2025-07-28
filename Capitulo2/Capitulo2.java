public class Perro {
    String nombre;

    void ladrar() {
        System.out.println(nombre + " dice: ¡Guau!");
    }

    public static void main(String[] args) {
        Perro miPerro = new Perro();
        miPerro.nombre = "Firulais";
        miPerro.ladrar();
    }
}
