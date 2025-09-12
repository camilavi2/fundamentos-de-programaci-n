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
public class ejercicio4_7 {

    /**
     * @param args the command line arguments
     */
public static void main (String[]args){
Scanner teclado=new Scanner (System.in);
int c;
int n;
int i=1;
int cm=0;
int cme=0;
int cero=0;
System.out.println("Ingrese la cantidad de numeros");
c=teclado.nextInt();

while(i<=c){
    System.out.println("Ingrese el numero "+i);
    n=teclado.nextInt();
    if(n<0){
        System.out.println(n+"es menor a cero");
cme=cme+1;
    }else if(n==0){
        System.out.println(n+"el numero es cero");
cero=0+1;
    }else{
        System.out.println("El numero es mayor a cero");
        cm=cm+1;
    }
    i++;
}
System.out.println("La cantidad de numeros que son cero es: "+cero);
System.out.println("La cantidad de numeros que son menores a cero son: "+cme);
System.out.println("La cantidad de numeros que son mayores a cero son: "+cm);
//4.8

    }
    
}
