import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Prestable> lista = new ArrayList<>();

        int opcion;

        do {
            System.out.println("\n=== SISTEMA BIBLIOTECA ===");
            System.out.println("1. Agregar Libro");
            System.out.println("2. Agregar Revista");
            System.out.println("3. Agregar DVD");
            System.out.println("4. Agregar Laptop");
            System.out.println("5. Mostrar y probar recursos");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Título: ");
                    String t1 = sc.nextLine();
                    System.out.print("Autor: ");
                    String a1 = sc.nextLine();
                    System.out.print("Año: ");
                    int anio1 = sc.nextInt();
                    sc.nextLine();

                    lista.add(new Libro(t1, a1, anio1));
                    break;

                case 2:
                    System.out.print("Título: ");
                    String t2 = sc.nextLine();
                    System.out.print("Autor: ");
                    String a2 = sc.nextLine();
                    System.out.print("Año: ");
                    int anio2 = sc.nextInt();
                    sc.nextLine();

                    lista.add(new Revista(t2, a2, anio2));
                    break;

                case 3:
                    System.out.print("Título: ");
                    String t3 = sc.nextLine();
                    System.out.print("Autor: ");
                    String a3 = sc.nextLine();
                    System.out.print("Año: ");
                    int anio3 = sc.nextInt();
                    sc.nextLine();

                    lista.add(new DVD(t3, a3, anio3));
                    break;

                case 4:
                    System.out.print("Marca de la laptop: ");
                    String marca = sc.nextLine();

                    lista.add(new Laptop(marca));
                    break;

                case 5:
                    System.out.println("\n=== LISTA DE RECURSOS ===");

                    for (Prestable item : lista) {

                        if (item instanceof RecursoBiblioteca) {
                            ((RecursoBiblioteca) item).mostrarInfoBase();
                        } else if (item instanceof Laptop) {
                            ((Laptop) item).mostrarInfo();
                        }

                        item.mostrarReglasPrestamo();
                        item.prestar();
                        if (item.estaPrestado()) {
                            if (item instanceof Libro) {
                                System.out.println("✅ Sí, este libro ha sido prestado");
                            } else if (item instanceof Revista) {
                                System.out.println("✅ Sí, esta revista ha sido prestada");
                            } else if (item instanceof DVD) {
                                System.out.println("✅ Sí, este DVD ha sido prestado");
                            } else if (item instanceof Laptop) {
                                System.out.println("✅ Sí, esta laptop ha sido prestada");
                            }
                        } else {
                            System.out.println("❌ Este recurso está disponible");
                        }
                        item.devolver();

                        System.out.println("----------------------");
                    }
                    break;
            }

        } while (opcion != 0);

        sc.close();
    }
}