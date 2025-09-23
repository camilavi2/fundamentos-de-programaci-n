/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;
import java.util.Scanner;

public class nombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] estudiantes = new String[5];
        String[] edades = new String[5];
        String[] promedios = new String[5];

        System.out.println("=== REGISTRO DE ESTUDIANTES ===");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.print("Ingresa el nombre del estudiante " + (i + 1) + ": ");
            estudiantes[i] = sc.nextLine();

            System.out.print("Ingresa la edad del estudiante " + (i + 1) + ": ");
            edades[i] = sc.nextLine();

            System.out.print("Ingresa el promedio del estudiante " + (i + 1) + ": ");
            promedios[i] = sc.nextLine();
        }

    
        System.out.println("\nNombre      Edad      Promedio");
        System.out.println("---------------------------------");

     
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i] + "      " + edades[i] + "      " + promedios[i]);
        }

        System.out.println("\nNombres invertidos:");
        for (String nombre : estudiantes) {
            String invertido = "";
            for (int i = 0; i < nombre.length(); i++) {
                char c = nombre.charAt(i);
                if (Character.isUpperCase(c)) {
                    invertido += Character.toLowerCase(c);
                } else if (Character.isLowerCase(c)) {
                    invertido += Character.toUpperCase(c);
                } else {
                    invertido += c;
                }
            }
            System.out.println(invertido);
        }

        System.out.print("\nIngresa el nombre a buscar: ");
        String buscado = sc.nextLine();
        boolean encontrado = false;

        for (String nombre : estudiantes) {
            if (nombre.equalsIgnoreCase(buscado)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El estudiante " + buscado + " está en la lista.");
        } else {
            System.out.println("El estudiante " + buscado + " no fue encontrado.");
        }
    }
}
