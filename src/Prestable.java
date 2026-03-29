public interface Prestable {
    // Metodos abstractos que las clases concretas deben implementar
    void prestar();
    void devolver();
    boolean estaPrestado();

    // Metodo por defecto en una interfaz
    default void mostrarReglasPrestamo() {
        System.out.println("Regla General: Cuide el recurso y devuélvalo en la fecha acordada.");
    }
}