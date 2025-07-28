public class Libro {
    String titulo;
    String autor;

    public static void main(String[] args) {
        Libro miLibro = new Libro();
        miLibro.titulo = "Head First Java";
        miLibro.autor = "Kathy Sierra";
        System.out.println("Título: " + miLibro.titulo);
        System.out.println("Autor: " + miLibro.autor);
    }
}
