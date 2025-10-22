/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2;


import java.util.Scanner;

/**
 *
 * @author camil
 */
public class examen2 {

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
     public static void recorrerA(int[] arreglo) {
        System.out.println("Los números en el arreglo son:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
  
  
    }
     public static int[] agregar(int[] arreglo, int buscado) {
    Scanner teclado = new Scanner(System.in);
    int numeros = arreglo.length + 1;
    int[] na = new int[numeros];

  
    for (int i = 0; i < arreglo.length; i++) {
        na[i] = arreglo[i];
    }

  
    for (int i = arreglo.length; i < numeros; i++) {
        na[i] = buscado;
    }
    
    System.out.println("Arreglo con valores agregados:");
    ordenar1(na);
  buscarposicion(na,buscado);
    return na;
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
    public static void buscar(int[] arreglo){
    Scanner teclado=new Scanner(System.in);
    String res="si";
    do{
        System.out.print("\nIngresa el numero a buscar: ");
        int buscado = teclado.nextInt();
   boolean encontrado=false;
 
 for(int i=0;i<arreglo.length;i++){
        int encontrar=arreglo[i];
         if(encontrar==buscado){
    System.out.println("El numero " + buscado + " está en la lista en la posicion."+i);
    encontrado=true;
         }
            }
 if(encontrado==false){
     int r=1;
arreglo = agregar(arreglo,buscado); 
 }
      
           
          System.out.println("Desaea buscar otro valor?");
      res=teclado.next();
    }while(res.equals("si"));
 
}
       public static void buscarposicion(int[] na, int buscado){
 for(int i=0;i<na.length;i++){
        int encontrar=na[i];
         if(encontrar==buscado){
    System.out.println("El numero " + buscado + "se agrego en la posicion."+i);
         }
         
        };
  
}

    public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuantos numeros desea ingresar?");
        int n=teclado.nextInt();
          int[] arreglo = almacenar(n);
      
          ordenar1(arreglo);
          buscar(arreglo);
           
    }
    
}
