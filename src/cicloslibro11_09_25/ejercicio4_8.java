/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cicloslibro11_09_25;


/**
 *
 * @author camil
 */
public class ejercicio4_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int pares=0;
int i;

for(i=1; i<=100; i++){
if(i%2==0){
    System.out.println("El número "+i+" es par");
    pares=pares+1;
}

}System.out.println("La cantidad de numeros pares del 1 al 100 es: "+pares);




    }
    
}
