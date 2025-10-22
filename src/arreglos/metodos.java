/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;

import java.util.Scanner;

public class metodos {

    public static int[] almacenar(int n) {
        Scanner teclado = new Scanner(System.in);
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un número: ");
            int numero = teclado.nextInt();
            arreglo[i] = numero;
        }
        return arreglo;
    }
public static int[] agregar(int[] arreglo, int r) {
    Scanner teclado = new Scanner(System.in);
    int numeros = arreglo.length + r;
    int[] na = new int[numeros];

  
    for (int i = 0; i < arreglo.length; i++) {
        na[i] = arreglo[i];
    }

  
    for (int i = arreglo.length; i < numeros; i++) {
        System.out.println("Ingrese un número para agregar:");
        na[i] = teclado.nextInt();
    }

    System.out.println("Arreglo con valores agregados:");
    recorrerA(na);
    return na;
}
  
    public static void recorrerA(int[] arreglo) {
        System.out.println("Los números en el arreglo son:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
  
    
    }
     public static void recorrerD(int[] arreglo) {
        System.out.println("Los números en el arreglo en posicion descendente son:");
        for (int i = arreglo.length-1; i>=0; i--) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println(); 
    }
public static void buscar(int[] arreglo){
    Scanner teclado=new Scanner(System.in);
    String res="si";
    do{
        System.out.print("\nIngresa el numero a buscar: ");
        int buscado = teclado.nextInt();
        boolean encontrado = false;

        for (int numero : arreglo) {
            if (numero==buscado) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El numero " + buscado + " está en la lista.");
        } else {
            System.out.println("El numero " + buscado + " no fue encontrado.");
        }
          System.out.println("Desaea buscar otro valor?");
      res=teclado.next();
    }while(res.equals("si"));
}
public static void modificarN(int[]arreglo){
 Scanner teclado=new Scanner(System.in);
 String res="si";
 boolean encontrado=false;
 
 do{
        System.out.print("\nIngresa la posicion del número a modificar: ");
        int modificar = teclado.nextInt();
if (modificar < 0 || modificar >= arreglo.length) {
        System.out.println("La posicion ingresada no se encuentra en el arreglo");
       
    }else{
        System.out.println("\nIngresa el nuevo numero que sustituira al valor: "+arreglo[modificar]);
        int nuevo = teclado.nextInt();
        arreglo[modificar]=nuevo;
     
      recorrerA(arreglo);
}
      System.out.println("Desaea modificar otro valor?");
      res=teclado.next();

 }while(res.equals("si"));
}   
public static int[] eliminarN(int[] arreglo) {
    Scanner teclado = new Scanner(System.in);
    String res = "si";
    do {
        System.out.print("Ingresa la posición del número a eliminar: ");
        int eliminar = teclado.nextInt();

        if (eliminar < 0 || eliminar >= arreglo.length) {
            System.out.println("La posición ingresada no se encuentra en el arreglo.");
        } else {
            int eliminado = arreglo[eliminar]; 
            int[] nuevo = new int[arreglo.length - 1];

            int e = 0;
            for (int i = 0; i < arreglo.length; i++) {
                if (i != eliminar) { 
                    nuevo[e] = arreglo[i];
                    e++;
                }
            }

            System.out.println("El número " + eliminado + " fue eliminado.");
            arreglo = nuevo; 
            recorrerA(arreglo);
        }

        System.out.print("¿Desea eliminar otro valor? (si/no): ");
        res = teclado.next();

    } while (res.equalsIgnoreCase("si"));

    return arreglo; 
}  
public static int[] eliminarTodo() {
    System.out.println("Todos los elementos han sido eliminados.");
    return new int[0]; 
}
public static void ordenar1(int arreglo[]) {
    for (int i = 0; i < arreglo.length - 1; i++) {             
        for (int p = 0; p < arreglo.length - i - 1; p++) {     
            int menor = arreglo[p];
            int mayor = arreglo[p + 1];

            if (menor > mayor) {
                arreglo[p] = mayor;
                arreglo[p + 1] = menor;
            }
     
        }
    }
     recorrerA(arreglo);
}
public static void ordenar2(int arreglo[]) {

    for (int i = 0; i < arreglo.length - 1; i++) {            
        for (int p = 0; p < arreglo.length - i - 1; p++) {   
            int menor = arreglo[p];
            int mayor = arreglo[p + 1];

            if (menor < mayor) {
                arreglo[p] = mayor;
                arreglo[p + 1] = menor;
            }
     
        }
    }
     recorrerA(arreglo);
}
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuantos numeros desea ingresar?");
        int n=teclado.nextInt();
          int[] arreglo = almacenar(n);
          String volver="si";
 do{
         recorrerA(arreglo);

  System.out.println("¿que operacion desea realizar en el arreglo:");
  System.out.println("recorrer Ascendentemete=1 \n recorrer Descendentemente=2 \n buscar valor=3 \n modificar valor=4 \n eliminar valor=5 \n ordenar de menor a mayor=6 \n ordenar de mayor a menor=7\n agreagar valor=8 \n eliminar arreglo=9");
int res=teclado.nextInt();
switch(res){
       case 1:
       recorrerA(arreglo);
       break;
       case 2: 
       recorrerD(arreglo);
       break;
       case 3:     
           buscar(arreglo);
     
              break;
              case 4:
                  modificarN(arreglo);           
break;
case 5:
    arreglo = eliminarN(arreglo); 
break;
 
case 6: 
     ordenar1(arreglo);
break;
case 7:
    ordenar2(arreglo);
break;
case 8:
    System.out.println("¿Cuántos números desea agregar?");
    int r = teclado.nextInt();
    arreglo = agregar(arreglo, r); 
   
    break;
    case 9:
      arreglo = eliminarTodo(); 
   ordenar1(arreglo);
    break;
     default:
                    System.out.println("Opción inválida.");
    } 
System.out.println("Desea realizar otra operación?");
volver=teclado.next();
    }while(volver.equals("si"));
 
}}