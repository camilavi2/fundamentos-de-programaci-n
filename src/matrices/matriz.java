
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author camil
 */
public class matriz {

    /**
     * @param args the command line arguments
     */
      public static int[][] almacenar(int f, int c) {
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[f][c];
        for (int i = 0; i < f; i++) {
            for (int j=0;j<c;j++){
            System.out.println("Ingrese un número: ");
            int numero = teclado.nextInt();
            matriz[i][j] = numero;
        }}
        return matriz;
    }
      public static void recorrerA(int[][] matriz, int f, int c) {
          if(matriz.length==0){
                System.out.println("La matriz esta vacia");
                }else{
        System.out.println("Los números en la matriz son:");
        for (int i = 0; i < f; i++) {
            for (int j=0;j<c;j++){
                if(matriz[i][j]==Integer.MIN_VALUE){
                         System.out.print(" - ");
 
                }
                else{
          System.out.print(matriz[i][j] + " ");
         
        }
            
            }System.out.println(" "); }}
    
    }
   public static void buscar(int[][] matriz){
    Scanner teclado = new Scanner(System.in);
    if (matriz.length == 0) {
    System.out.println("La matriz está vacía. Por favor, rellénala primero.");
    return;
}
    String res = "si";
    do {
        System.out.print("\nIngresa el número a buscar: ");
        int buscado = teclado.nextInt();
        boolean encontrado = false;

        for (int[] fila : matriz) {
            for (int numero : fila) {
                if (numero == buscado) {
                    encontrado = true;
                    break;
                }
            }
            if (encontrado) break;
        }

        if (encontrado) {
            System.out.println("El número " + buscado + " está en la matriz.");
        } else {
            System.out.println("El número " + buscado + " no fue encontrado.");
        }

        System.out.println("¿Desea buscar otro valor? (si/no)");
        res = teclado.next();
    } while (res.equalsIgnoreCase("si"));
}
public static void modificarN(int[][]matriz, int f, int c){
    if (matriz.length == 0) {
    System.out.println("La matriz está vacía. Por favor, rellénala primero.");
    return;
}
 Scanner teclado=new Scanner(System.in);
 String res="si";


 do{
     boolean encontrado=false;  
        System.out.print("\nIngresa el número a modificar: ");
        int modificar = teclado.nextInt();

        for (int i = 0; i < f; i++) {
            for (int j=0;j<c;j++){
     if(matriz[i][j]==modificar){
 System.out.println("\nIngresa el nuevo numero que sustituira al valor: "+matriz[i][j]);
        int nuevo = teclado.nextInt();
        matriz[i][j]=nuevo;
 
      recorrerA(matriz,f,c);
      encontrado=true;
}
}if(encontrado==true){
break;
}
     }if(encontrado==false){
 System.out.println("\nEl numero a modificar no fue encontrado");   
        } 
      System.out.println("Desaea modificar otro valor?");
      res=teclado.next();

 }while(res.equals("si"));
}   
  public static void eliminarN(int[][]matriz, int f, int c) {
      if (matriz.length == 0) {
    System.out.println("La matriz está vacía. Por favor, rellénala primero.");
    return;
}
    Scanner teclado = new Scanner(System.in);
    String res = "si";
     do{
     boolean encontrado=false;  
        System.out.print("\nIngresa el número a eliminar: ");
        int eliminar = teclado.nextInt();

        for (int i = 0; i < f; i++) {
            for (int j=0;j<c;j++){
     if(matriz[i][j]==eliminar){
     
        matriz[i][j]=Integer.MIN_VALUE;
 
      encontrado=true;
}}
}if(encontrado==true){
    System.out.println("El número"+eliminar+"ha sido eliminado.");
}else{
 System.out.println("\nEl numero a eliminar no fue encontrado");   
        } 
recorrerA(matriz,f,c);
      System.out.println("Desea eliminar otro valor?");
      res=teclado.next();

 }while(res.equals("si"));
   
}   
  public static int[][] eliminarTodo(int [][]matriz) {
      if (matriz.length == 0) {
    System.out.println("La matriz está vacía. Por favor, rellénala primero.");
}else{
    System.out.println("Todos los elementos han sido eliminados.");
    matriz= new int[0][0]; 
    
      }
      return matriz;
  }
public static int[][] ordenar1(int[][] matriz, int f, int c) {
        if (matriz.length == 0) {
    System.out.println("La matriz está vacía. Por favor, rellénala primero.");
   
}else{
 // arreglo para recorrer con el mismo metodo burbuja en un arreglo
    int[] arreglo = new int[f * c];//número de datos de la matriz
    int posicion = 0;

    for (int i = 0; i < f; i++) {//fila
        for (int j = 0; j < c; j++) {//columna
            arreglo[posicion++] = matriz[i][j]; 
        }
    }

    for (int i = 0; i < arreglo.length - 1; i++) {
        for (int j = 0; j < arreglo.length - i - 1; j++) {
            if (arreglo[j] > arreglo[j + 1]) {
                int temp = arreglo[j];
                arreglo[j] = arreglo[j + 1];
                arreglo[j + 1] = temp;
            }
        }
    }

    //ingreso los valores ordenados de nuevo en la matriz
    posicion = 0;
    for (int i = 0; i < f; i++) {
        for (int j = 0; j < c; j++) {
            matriz[i][j] = arreglo[posicion++];
        }
    }

   recorrerA(matriz, f, c);}
          return matriz;
}
  public static int[][] rellenar(int [][]matriz,int c,int f){
          if (matriz.length == 0) {
Scanner teclado = new Scanner(System.in);
        matriz = new int[f][c];
        for (int i = 0; i < f; i++) {
            for (int j=0;j<c;j++){
            System.out.println("Ingrese un número: ");
            int numero = teclado.nextInt();
            matriz[i][j] = numero;
        }
        }
   
}else{System.out.println("La matriz sigue llena, vaciela para rellenarla");
          }
        return matriz;
  }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuantas filas desea ingresar?");
        int f=teclado.nextInt();
          System.out.println("¿Cuantas columnas desea ingresar?");
        int c=teclado.nextInt();
          int [][] matriz = almacenar(f,c);
          
 String res="si";
        
      do{ 
          System.out.println("¿que operacion desea realizar?");
     System.out.println("recorrer=1 \n  buscar valor=2 \n modificar valor=3 \n eliminar numero=4 \n eliminar todo=5\n ordenar=6, rellenar=7");

      int op=teclado.nextInt();
      switch(op){
          case 1:
                 recorrerA(matriz,f,c);
                 break;
          case 2:
      buscar(matriz);
      break;
          case 3:
            modificarN(matriz,f,c);
            break;
          case 4:
                 eliminarN(matriz,f,c);
                 break;
          case 5:   
     matriz = eliminarTodo(matriz);
       recorrerA(matriz,f,c);
       break;
          case 6:
              ordenar1(matriz,f,c);
              break;
          case 7:
        matriz = rellenar(matriz,f,c);
                           break;
          default:
              System.out.println("Opcion no valida");
      }
  System.out.println("Desea realizar otra operación?");
 res=teclado.next();
      }while(res.equals("si"));  
    }
}
 


 
    
