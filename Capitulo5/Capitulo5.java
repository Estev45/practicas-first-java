public class Baraja {
    String palo;
    int numero;

    void mostrarCarta() {
        System.out.println("Carta: " + numero + " de " + palo);
    }

    public static void main(String[] args) {
        Baraja carta = new Baraja();
        carta.numero = 7;
        carta.palo = "Corazones";
        carta.mostrarCarta();
    }
}
