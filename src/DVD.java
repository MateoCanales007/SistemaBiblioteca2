public class DVD extends RecursoBiblioteca {

    public DVD(String titulo, String autor, int anioPublicacion) {
        super(titulo, autor, anioPublicacion);
    }

    @Override
    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("El DVD " + titulo + " se prestó correctamente 🎬");
        } else {
            System.out.println("El DVD " + titulo + " no está disponible");
        }
    }

    @Override
    public void devolver() {
        prestado = false;
        System.out.println("Se devolvió el DVD " + titulo);
    }
}