public class Revista extends RecursoBiblioteca {
    // se llama el constructor padre para solo mandar las varibales ya hechas en RecursoBiblioteca
    public Revista(String titulo, String autor, int anioPublicacion){
        super(titulo, autor, anioPublicacion);
    }
    //se crea el metodo de la interfaz prestar()
    @Override
    public void prestar(){
        if (!prestado){
            prestado = true;
            System.out.println("Se presto la revista " + titulo);
        } else{
            System.out.println("La revista " + titulo + " " + "no esta disponible por el momento");
        }
    }
    //se crea el metodo de la interfaz devolver()
    @Override
    public void devolver(){
        prestado = false;
        System.out.println("Se devolvio la revista " + titulo);
    }
}

