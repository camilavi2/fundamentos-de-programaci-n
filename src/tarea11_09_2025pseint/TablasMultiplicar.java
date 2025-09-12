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
public class TablasMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
 int n;
 int i=1;
 do{
     System.out.println("Escriba un número (0 para terminar)");
     n=teclado.nextInt();
     System.out.println("tabla de multipicar de "+n+":");
     for(i=1;i<=10;i++){
     System.out.println(n +"x"+ i +"= "+n*i);
     
     }
 }while(n!=0);
 System.out.println("Programa terminado");
    }
    
}
