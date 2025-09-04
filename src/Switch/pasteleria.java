/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Switch;

import java.util.Scanner;

/**
 *
 * @author camil
 */
public class pasteleria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String sabor, chocolate, snack, nombre;
        int precio = 0, total = 0, cantidad = 0;
        boolean saborValido = false;

        System.out.println("Ingrese el sabor del pastel (/manzana,fresa, chocolate):");
        sabor = teclado.next().toLowerCase(); 
        switch (sabor) {
            case "manzana":
                precio = 200;
                saborValido = true;
                break;
            case "fresa":
                precio = 250;
                saborValido = true;
                break;
            case "chocolate":
                System.out.println("¿Desea chocolate blanco o negro?");
                chocolate = teclado.next().toLowerCase();
                switch (chocolate) {
                    case "blanco":
                        precio = 300;
                        saborValido = true;
                        break;
                    case "negro":
                        precio = 280;
                        saborValido = true;
                        break;
                    default:
                        System.out.println("Tipo de chocolate no válido");
                        saborValido = false;
                        break;
                }
                break;
            default:
                System.out.println("Sabor de pastel no válido");
                saborValido = false;
                break;
        }
       if (saborValido) {
            total = precio;
            System.out.println("¿Desea añadir snack? (si/no)");
            snack = teclado.next().toLowerCase();
            if (snack.equals("si")) {
                System.out.println("¿Cuántos snacks desea agregar?");
                cantidad = teclado.nextInt();
                total = total + (cantidad * 25);
            }

            System.out.println("¿Desea añadir un nombre en su pastel? (si/no)");
            nombre = teclado.next().toLowerCase();
            if (nombre.equals("si")) {
                total = total + 30;
            }

            System.out.println("El precio total del pastel es: $" + total);
        }
 
    }   
}
