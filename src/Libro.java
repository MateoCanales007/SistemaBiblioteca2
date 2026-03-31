public class Libro extends RecursoBiblioteca {

    //se llamo super ya que en RecursoBiblioteca ya estan definido las variables y solo se llama el constructor de clase padre
    public Libro(String titulo, String autor, int anioPublicacion){
        super(titulo, autor, anioPublicacion);
    }

    // Se crea el metodo de la inferfaz prestar()
    @Override
    public void prestar(){
        if (!prestado){
            prestado = true;
            System.out.println("El libro " + titulo + " " + "se presto con exito");
        } else {
            System.out.println("El libro " + titulo + " " + "no se puede prestar por el momento");
        }
    }

    // Se crea el metodo de la interfaz devolver()
    @Override
    public void devolver(){
        prestado = false;
        System.out.println("Se devolvio el Libro " + titulo);
    }
}


