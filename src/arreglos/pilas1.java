/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;
import java.util.Scanner;
/**
 *
 * @author camil
 */
public class pilas1 {


    public static String[] almacenar(int n) {
        Scanner teclado = new Scanner(System.in);
        String[] pila = new String[n + 1]; // índice 0 queda null
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese un valor: ");
            pila[i] = teclado.next();
        }
        return pila;
    }

 
    public static void recorrerA(String[] pila, int tope) {
        System.out.println("Pila de abajo hacia arriba:");
        for (int i = 1; i <= tope; i++) {
            System.out.print(pila[i] + " ");
        }
        System.out.println();
    }

 
    public static void recorrerD(String[] pila, int tope) {
        System.out.println("Pila del tope hacia abajo:");
        for (int i = tope; i >= 1; i--) {
            System.out.print(pila[i] + " ");
        }
        System.out.println();
    }

  
    public static void buscar(String[] pila, int tope) {
        Scanner teclado = new Scanner(System.in);
        String res = "si";
        do {
            System.out.print("\nIngresa el valor a buscar: ");
            String buscado = teclado.next();
            boolean encontrado = false;

            for (int i = 1; i <= tope; i++) {
                if (pila[i].equals(buscado)) {
                    encontrado = true;
                    break;
                }
            }

            if (encontrado) {
                System.out.println("El valor " + buscado + " esta en la pila.");
            } else {
                System.out.println("El valor " + buscado + " no fue encontrado.");
            }

            System.out.print("¿Desea buscar otro valor? ");
            res = teclado.next();
        } while (res.equalsIgnoreCase("si"));
    }

    public static void modificarN(String[] pila, int tope) {
        Scanner teclado = new Scanner(System.in);
        String res = "si";

        do {
            System.out.print("\nIngresa la posición a modificar (1 a " + tope + "): ");
            int pos = teclado.nextInt();

            if (pos < 1 || pos > tope) {
                System.out.println("Posición no valida.");
            } else {
                System.out.println("Valor actual en [" + pos + "] = " + pila[pos]);
                System.out.print("Ingrese el nuevo valor: ");
                pila[pos] = teclado.next();
            }

            recorrerA(pila, tope);
            System.out.print("¿Desea modificar otro valor? ");
            res = teclado.next();

        } while (res.equalsIgnoreCase("si"));
    }

  
    public static int eliminarPila(String[] pila, int tope) {
        Scanner teclado = new Scanner(System.in);
    if (tope == 0) {
            System.out.println("La pila esta vacia. No hay nada que eliminar.");
  
        }else{

            System.out.println("Se eliminaran todos los valores ");

            while (tope >= 1) {
                System.out.println("Se eliminó: " + pila[tope]);
                pila[tope] = null;
                tope--;

                recorrerA(pila, tope);
            }

    }

        return tope;
    }

    public static int eliminarN(String[] pila, int tope) {
    Scanner teclado = new Scanner(System.in);
    String res = "si";

    do {
        if (tope == 0) {
            System.out.println("La pila esta vacia. No hay nada que eliminar.");
            break;
        }

        System.out.print("Ingresa la posición a eliminar (1 a " + tope + "): ");
        int pos = teclado.nextInt();

        if (pos < 1 || pos > tope) {
            System.out.println("Posición invalida.");
        } else {
            System.out.println("Se eliminaran desde la posición " + pos + " hasta el tope.");

            while (tope >= pos) {
                System.out.println("Se elimino: " + pila[tope]);
                pila[tope] = null;
                tope--;

                recorrerA(pila, tope);
            }
        }

        System.out.print("¿Desea eliminar otro valor? ");
        res = teclado.next();

    } while (res.equalsIgnoreCase("si"));

    return tope;
}
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Cuántos caracteres desea ingresar? ");
        int n = teclado.nextInt();

        String[] pila = almacenar(n);
        int tope = n;

        String volver = "si";
        do {
            System.out.println("\n--- OPERACIONES CON LA PILA ---");
            System.out.println("1. Recorrer Ascendente (abajo-tope)");
            System.out.println("2. Recorrer Descendente (tope - abajo)");
            System.out.println("3. Buscar valor");
            System.out.println("4. Modificar valor");
            System.out.println("5. Eliminar PILA");
            System.out.println("6. Eliminar ");

            System.out.println("7. Salir");
            int res = teclado.nextInt();

            switch (res) {
                case 1:
                    recorrerA(pila, tope);
                    break;
                case 2:
                    recorrerD(pila, tope);
                    break;
                case 3:
                    buscar(pila, tope);
                    break;
                case 4:
                    modificarN(pila, tope);
                    break;
                case 5:
                    tope = eliminarPila(pila, tope);
                    break;
                    case 6:
                    tope = eliminarN(pila, tope);
                    break;
                case 7:
                    volver = "no";
                    break;
                default:
                    System.out.println("Opción invalida.");
            }

            if (res != 6) {
                System.out.print("\n¿Desea realizar otra operación? ");
                volver = teclado.next();
            }

        } while (volver.equalsIgnoreCase("si"));

     
    }
}