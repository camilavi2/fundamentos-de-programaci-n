/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;

import java.util.Scanner;

public class cola {

    public static String[] almacenar(int n) {
        Scanner teclado = new Scanner(System.in);
        String[] cola = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un valor: ");
            cola[i] = teclado.next();
        }
        return cola;
    }

    public static void recorrerCola(String[] cola, int frente, int max) {
         if (max == 0) {
            System.out.println("La cola está vacia. No hay nada que mostrar.");
        } else{
             System.out.println("Cola (frente - final):");
        for (int i = frente; i < max; i++) {
            if (cola[i] != null) {
                System.out.print(cola[i] + " ");
            }
        }
        System.out.println();
    }
    }

    public static void buscar(String[] cola, int frente, int max) {
        Scanner teclado = new Scanner(System.in);
        String res;

        do {
            System.out.print("\nIngresa el valor a buscar: ");
            String buscado = teclado.next();
            boolean encontrado = false;

            for (int i = frente; i < max; i++) {
                if (cola[i] != null && cola[i].equals(buscado)) {
                    encontrado = true;
                    break;
                }
            }

            if (encontrado) {
                System.out.println("El valor " + buscado + " esta en la cola.");
            } else {
                System.out.println("El valor " + buscado + " no fue encontrado.");
            }

            System.out.print("¿Desea buscar otro valor? ");
            res = teclado.next();
        } while (res.equalsIgnoreCase("si"));
    }

    public static void modificarN(String[] cola, int frente, int max) {
        Scanner teclado = new Scanner(System.in);
        String res;

        do {
            System.out.print("\nIngresa la posición a modificar (" + frente + " a " + (max - 1) + "): ");
            int pos = teclado.nextInt();

            if (pos < frente || pos >= max) {
                System.out.println("Posición inválida.");
            } else {
                System.out.println("Valor actual en [" + pos + "] = " + cola[pos]);
                System.out.print("Ingrese el nuevo valor: ");
                cola[pos] = teclado.next();
            }

            recorrerCola(cola, frente, max);

            System.out.print("¿Desea modificar otro valor? ");
            res = teclado.next();

        } while (res.equalsIgnoreCase("si"));
    }

    public static int eliminarcola(String[] cola, int frente, int max) {
    if (max == 0) {
        System.out.println("La cola esta vacia. No hay nada que eliminar.");
        return max;
    }

    System.out.println("Se eliminaran todos los valores de la cola:");


    while (max > 0) {
        System.out.println("Se elimino: " + cola[0]);
        int aux = 1;
        int aux2 = 0;
        while (aux < max) {
            cola[aux2] = cola[aux];
            aux++;
            aux2++;
        }


        cola[max - 1] = null;

        max--;
        recorrerCola(cola, frente, max);
        if(max==0){
            System.out.println("Todos los elementos fueron eliminados, la cola esta vacia");
        }
    }

    return max;
}
    public static int eliminarUno(String[] cola, int max) {
        if (max == 0) {
            System.out.println("La cola está vacia. No hay nada que eliminar.");
        } else {
            System.out.println("Se eliminara: " + cola[0]);

   
            int aux = 1;
            int aux2 = 0;
            while (aux < max) {
                cola[aux2] = cola[aux];
                aux++;
                aux2++;
            }
            cola[max - 1] = null;
            max--;
            recorrerCola(cola, 0, max);
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Cuántos caracteres desea ingresar? ");
        int n = teclado.nextInt();

        String[] cola = almacenar(n);
        int max = n;   
        int frente = 0;  

        String volver = "si";
        do {
            System.out.println("\n  OPERACIONES  ");
            System.out.println("1. Recorrer cola");
            System.out.println("2. Buscar valor");
            System.out.println("3. Modificar valor");
            System.out.println("4. Eliminar un elemento (del frente)");
            System.out.println("5. Eliminar toda la cola");
            System.out.println("6. Salir");

            int res = teclado.nextInt();

            switch (res) {
                case 1:
                    recorrerCola(cola, frente, max);
                    break;
                case 2:
                    buscar(cola, frente, max);
                    break;
                case 3:
                    modificarN(cola, frente, max);
                    break;
                case 4:
                    max = eliminarUno(cola, max);
                    break;
                case 5:
                  max = eliminarcola(cola, frente, max);
                    break;
                case 6:
                    volver = "no";
                    break;
                default:
                    System.out.println("Opción no valida.");
            }

            if (res != 6) {
                System.out.print("\n¿Desea realizar otra operación? ");
                volver = teclado.next();
            }

        } while (volver.equalsIgnoreCase("si"));
    }
}