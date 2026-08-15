package vallegrande.edu.pe.controller;

import vallegrande.edu.pe.model.Libro;
import java.util.ArrayList;
import java.util.Scanner;

public class LibroController {
    private ArrayList<Libro> libros = new ArrayList<>();
    private int contadorId = 1;

    public void registrarLibro(Scanner sc) {
        String titulo;
        do {
            System.out.print("Título del libro: ");
            titulo = sc.nextLine().trim();
            if (titulo.isEmpty()) {
                System.out.println("❌ El título no puede estar vacío.");
            }
        } while (titulo.isEmpty());

        System.out.print("Autor: ");
        String autor = sc.nextLine().trim();

        Libro libro = new Libro(contadorId++, titulo, autor);
        libros.add(libro);
        System.out.println("✅ Libro registrado correctamente.");
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados aún.");
            return;
        }
        System.out.println("===== LISTA DE LIBROS =====");
        for (Libro l : libros) {
            System.out.println(l);
        }
    }

    public void buscarLibro(Scanner sc) {
        System.out.print("Ingrese el título a buscar: ");
        String busqueda = sc.nextLine().trim().toLowerCase();

        boolean encontrado = false;
        for (Libro l : libros) {
            if (l.getTitulo().toLowerCase().contains(busqueda)) {
                System.out.println(l);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún libro con ese título.");
        }
    }
}