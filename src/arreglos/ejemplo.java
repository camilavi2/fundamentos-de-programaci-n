/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;
import java.util.Scanner;

 
public class ejemplo {

   
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
  System.out.println("Programa de arreglos unidimensionales");
       System.out.println("Ingrese cunatos elementos va a guardar en el arreglo");
        int elementos=teclado.nextInt();
        int[] A =new int[elementos];
        System.out.println(A.length);
        for(int i=0;i<elementos;i++){
      System.out.println("Introduzca el valor para la posicion "+i);
      int valor=teclado.nextInt();
      A[i]=valor;
      
    }
    System.out.print("Los valores en el arreglo son: ");
      for(int i=0;i<elementos;i++){
      System.out.print(A[i]+" ");  
    }
      for (int i=0; i<A.length;i++){
      System.out.print(A[i]+" ");
      }
     /*/for(int i:A){
     System.out.print(A[i]+" ");
     }/*/

    }
    
    }
