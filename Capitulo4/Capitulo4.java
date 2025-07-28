public class Cancion {
    String titulo;
    String artista;

    void reproducir() {
        System.out.println("Reproduciendo " + titulo + " de " + artista);
    }

    public static void main(String[] args) {
        Cancion c = new Cancion();
        c.titulo = "Imagine";
        c.artista = "John Lennon";
        c.reproducir();
    }
}
