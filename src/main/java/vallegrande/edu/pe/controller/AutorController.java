package vallegrande.edu.pe.controller;

import vallegrande.edu.pe.model.Autor;
import java.util.ArrayList;
import java.util.Scanner;

public class AutorController {
    private ArrayList<Autor> autores = new ArrayList<>();
    private int contadorId = 1;

    public void registrarAutor(Scanner sc) {
        String nombre;
        do {
            System.out.print("Nombre del autor: ");
            nombre = sc.nextLine().trim();
            if (nombre.isEmpty()) {
                System.out.println("❌ El nombre no puede estar vacío. Intenta de nuevo.");
            }
        } while (nombre.isEmpty());

        Autor autor = new Autor(contadorId++, nombre);
        autores.add(autor);
        System.out.println("✅ Autor registrado correctamente.");
    }

    public void listarAutores() {
        if (autores.isEmpty()) {
            System.out.println("No hay autores registrados aún.");
            return;
        }
        System.out.println("===== LISTA DE AUTORES =====");
        for (Autor a : autores) {
            System.out.println(a);
        }
    }
}