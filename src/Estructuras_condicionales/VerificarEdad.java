/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package verificaredad;

import java.util.Scanner;

public class VerificarEdad {
    public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);
      int edad;
              System.out.println("Ingrese la edad");
                edad=teclado.nextInt();
                if(edad<18){
                 System.out.println("Es menor de edad");
                } else 
                    if(edad>18 & edad<65){
                     System.out.println("Es Adulto");
                    } else 
                     {
                         System.out.println("Es adulto mayor");
                      }
                teclado.close();
    }  
}
