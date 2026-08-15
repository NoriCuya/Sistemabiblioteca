package vallegrande.edu.pe.app;

import vallegrande.edu.pe.controller.LibroController;
import vallegrande.edu.pe.controller.AutorController;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibroController libroController = new LibroController();
        AutorController autorController = new AutorController();

        int opcion;
        do {
            System.out.println("\n===== BIBLIOTECA =====");
            System.out.println("1. Registrar libro");
            System.out.println("2. Listar libros");
            System.out.println("3. Buscar libro");
            System.out.println("4. Registrar autor nuevo");
            System.out.println("5. Listar autores nuevo");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = Integer.parseInt(sc.nextLine().trim());

            switch (opcion) {
                case 1:
                    libroController.registrarLibro(sc);
                    break;
                case 2:
                    libroController.listarLibros();
                    break;
                case 3:
                    libroController.buscarLibro(sc);
                    break;
                case 4:
                    autorController.registrarAutor(sc);
                    break;
                case 5:
                    autorController.listarAutores();
                    break;
                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("❌ Opción inválida.");
            }
        } while (opcion != 6);

        sc.close();
    }
}