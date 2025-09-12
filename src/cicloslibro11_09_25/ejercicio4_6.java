/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cicloslibro11_09_25;

import java.util.Scanner;

/**
 *
 * @author camil
 */
public class ejercicio4_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
       double a;
       int m, ca; 
       double total=0;
       m=1;
       while(m<=12){
           System.out.println("Ingrese la cantidad de dinero depositada en el mes ");
           a=teclado.nextInt();
           System.out.println(a);
          
           total=total+a;
       System.out.println("La cantidad ahorrada en el mes "+m +"es");
       m++;
       } 
       System.out.println("La cantidad total del año es " + total);
       
    }
    
}
