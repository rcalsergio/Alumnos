package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Vista {
    Scanner scanner;
    ArrayList<Alumno> alumnos = new ArrayList<>();
    public Vista() {
        //TODO
        //Crear varios alumnos

        //TODO
        //Añadirlos al arrayList de alumnos
    }

    public void getStarted() {
        do {
            System.out.println("\n******************** Bienvenido a IES de Teis ****************************");
            System.out.println("\n\t1. Ver Alumnos.\t\t\t\t\t\t\t\t4. Añadir Alumno.");
            System.out.println("\n\t2. Ver Alumno Estrella.\t\t\t\t\t\t5. Añadir nota a alumno.");
            System.out.println("\n\t3. Ver Nota media.\t\t\t\t\t\t\t0. Exit.");
            System.out.println("\n**************************************************************************");
            scanner = new Scanner(System.in);

            try {
                int choice = scanner.nextInt();
                if (choice == 1) {
                    System.out.println("Lista de alumnos matriculados:");
                    //TODO

                } else if (choice == 2) {
                    //TODO
                } else if (choice == 3) {
                    //TODO
                } else if (choice == 4) {
                    //TODO
                } else if (choice == 5) {
                    //TODO
                } else if (choice == 0) {
                    System.out.println("Bye!!");
                    System.exit(0);
                    ;
                } else {
                    System.err.println("[ERROR] Your option is incorrect!! Try again!!");
                }

            } catch (InputMismatchException e) {
                System.err.println("[ERROR] You must type a number!!!");
                scanner.next();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } while (true);
    }


}
