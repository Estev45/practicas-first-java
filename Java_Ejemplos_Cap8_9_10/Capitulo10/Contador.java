public class Contador {
    public static int veces = 0;

    public void aumentar() {
        veces++;
        System.out.println("Contador: " + veces);
    }

    public static void mostrarMensaje() {
        System.out.println("Este mensaje viene del método estático.");
    }
}