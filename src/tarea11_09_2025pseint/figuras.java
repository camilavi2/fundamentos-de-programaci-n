/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea11_09_2025;

import java.util.Scanner;

/**
 *
 * @author camil
 */
public class figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado= new Scanner(System.in);
       int n ,i, j, k;
       System.out.println("Ingreses el número de lineas de las figuras");
       n=teclado.nextInt();
       i=n;
       while(i>=1){
       for(j=1;j<=(n-i);j++){
       System.out.print(" ");
       }
       for(k=1; k<=2*i-1;k++){
      System.out.print("*");       
       }
      System.out.println(" ");
      i=i-1;
       }
       System.out.println(" ");
       i=1;
       while (i<=n){
       for(j=1;j<=(n-i);j++){
       System.out.print(" ");
       }
       for(k=1;k<=(2*i-1);k++){
              System.out.print("*");
       }
              System.out.println();
              i=i+1;
       }
       System.out.println();
       i=1;
        do {
            for (int r = 1; r <= n; r++) {
                System.out.print("* ");
            }
            System.out.println();
            i = i + 1;
        } while (i < n);
            
    }
    
}
