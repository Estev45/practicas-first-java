public class AdivinaNumero {
    int numeroSecreto = 7;

    void adivinar(int intento) {
        if (intento == numeroSecreto) {
            System.out.println("¡Correcto!");
        } else {
            System.out.println("Intenta otra vez.");
        }
    }

    public static void main(String[] args) {
        AdivinaNumero juego = new AdivinaNumero();
        juego.adivinar(5);
    }
}
