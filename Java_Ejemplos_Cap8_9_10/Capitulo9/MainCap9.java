public class MainCap9 {
    public static void main(String[] args) {
        Persona p1 = new Persona("Esteban", 20);
        Persona p2 = new Persona("Lucía", 18);

        p1.saludar();
        p2.saludar();

        p2 = null;
        System.out.println("Lucía ya no tiene referencia.");
    }
}