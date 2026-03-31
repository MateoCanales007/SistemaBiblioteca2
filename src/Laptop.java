public class Laptop implements Prestable {

    private String marca;
    private boolean prestado;

    public Laptop(String marca) {
        this.marca = marca;
        this.prestado = false;
    }

    @Override
    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("Laptop " + marca + " prestada 💻");
        } else {
            System.out.println("Laptop " + marca + " no disponible");
        }
    }

    @Override
    public void devolver() {
        prestado = false;
        System.out.println("Laptop " + marca + " devuelta");
    }

    @Override
    public boolean estaPrestado() {
        return prestado;
    }

    public void mostrarInfo() {
        System.out.println("💻 Laptop marca: " + marca);
    }
}