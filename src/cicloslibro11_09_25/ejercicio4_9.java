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
public class ejercicio4_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner teclado=new Scanner(System.in);
     System.out.println("Ingerese la cantidad de numeros de la serie fibonacci que desea imprimir");
int nf=teclado.nextInt();
int a=0;
int b=1;
int i=1;
int c;
c=0;
if(nf>=1){
    System.out.println(a);
}
if(nf>=2){
    System.out.println(""+b);

}
do { 
   c=a+b;
   System.out.println(c);
   a=b;
   b=c;
   i++; 
} while (i<nf);

    }
    
}
