public class MainCap10 {
    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();

        c1.aumentar();
        c2.aumentar();
        c1.aumentar();

        Contador.mostrarMensaje();
        System.out.println("Raíz cuadrada de 9 = " + Math.sqrt(9));
    }
}