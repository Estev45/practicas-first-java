public class Perro extends Animal implements Corredor {
    @Override
    public void sonido() {
        System.out.println("El perro ladra: guau guau");
    }

    @Override
    public void correr() {
        System.out.println("El perro está corriendo feliz");
    }
}