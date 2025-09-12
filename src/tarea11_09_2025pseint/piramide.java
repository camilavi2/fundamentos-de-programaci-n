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
public class piramide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado= new Scanner(System.in);
       int n;
       int i;
       System.out.println("Ingrese un número");
       n=teclado.nextInt();
       for(i=1;i<=n;i++){
           for(int x=1;x<=i;x++){
       System.out.print(x+" ");
       }    
       System.out.println(" ");
       }
       
    }
    
}
