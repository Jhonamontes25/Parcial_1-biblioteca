package com.parcial;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 5, 2);

        
        Libro libro2 = new Libro();

        System.out.println("=== INGRESO DE DATOS PARA libro2 ===");
        System.out.print("Ingrese el título del libro2: ");
        libro2.setTitulo(sc.nextLine());

        System.out.print("Ingrese el autor del libro2: ");
        libro2.setAutor(sc.nextLine());

        System.out.print("Ingrese el número de ejemplares del libro2: ");
        libro2.setNumeroEjemplares(Integer.parseInt(sc.nextLine()));

        System.out.print("Ingrese el número de ejemplares prestados del libro2: ");
        libro2.setNumeroEjemplaresPrestados(Integer.parseInt(sc.nextLine()));

        
        LibroTextoUNIAC libroUniac = new LibroTextoUNIAC(
                "Programación Orientada a Objetos",
                "Ana Gómez",
                10,
                3,
                "POO",
                "Ingeniería"
        );

        
        Novela novela1 = new Novela(
                "Sherlock Holmes",
                "Arthur Conan Doyle",
                6,
                1,
                "policíaca"
        );

        System.out.println("\n=========== DATOS DE LOS OBJETOS ===========");
        System.out.println("libro1:");
        System.out.println(libro1);

        System.out.println("\nlibro2:");
        System.out.println(libro2);

        System.out.println("\nlibroTextoUNIAC:");
        System.out.println(libroUniac);

        System.out.println("\nnovela1:");
        System.out.println(novela1);

        
        System.out.println("\n=========== PRUEBAS DE PRESTAMO ===========");
        if (libro1.prestamo()) {
            System.out.println("Préstamo realizado correctamente para libro1.");
        } else {
            System.out.println("No se pudo realizar el préstamo para libro1.");
        }

        if (libro2.prestamo()) {
            System.out.println("Préstamo realizado correctamente para libro2.");
        } else {
            System.out.println("No se pudo realizar el préstamo para libro2.");
        }


        System.out.println("\n=========== PRUEBAS DE DEVOLUCION ===========");
        if (libro1.devolucion()) {
            System.out.println("Devolución realizada correctamente para libro1.");
        } else {
            System.out.println("No se pudo realizar la devolución para libro1.");
        }

        if (libro2.devolucion()) {
            System.out.println("Devolución realizada correctamente para libro2.");
        } else {
            System.out.println("No se pudo realizar la devolución para libro2.");
        }

        System.out.println("\n=========== ESTADO FINAL ===========");
        System.out.println("libro1:");
        System.out.println(libro1);

        System.out.println("\nlibro2:");
        System.out.println(libro2);

        /*
         * Situación 1 donde no se puede realizar herencia:
         * Si una clase está declarada como final, no puede ser heredada.
         * Ejemplo: public final class Libro { }
         */

        /*
         * Situación 2 donde no se puede realizar herencia:
         * Los constructores no se heredan, y además los miembros private
         * no pueden ser accedidos directamente desde la subclase.
         * Por eso usamos getters/setters o super().
         */

        sc.close();
    }
}