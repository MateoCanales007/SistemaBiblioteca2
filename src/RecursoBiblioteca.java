public abstract class RecursoBiblioteca implements Prestable {
// Implementamos la interfaz para que todos los recursos hereden esta obligación
    // Atributos protegidos para que las clases hijas tengan acceso
    protected String titulo;
    protected String autor;
    protected int anioPublicacion;
    protected boolean prestado;

    // Constructor base
    public RecursoBiblioteca(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.prestado = false; //los recursoss nuevos inician sin estar prestado
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    // Metodo comun para todos los recursos
    public void mostrarInfoBase() {
        System.out.println("📖 Título: " + titulo + " | Autor: " + autor + " | Año: " + anioPublicacion);
    }

    // Sobreescribimos (Override) este metodo aquí porque la lógica es igual para todos
    @Override
    public boolean estaPrestado() {
        return prestado;
    }

    // Obligamos a que 'Libro', 'Revista' y 'DVD' lo hagan a su manera.
}