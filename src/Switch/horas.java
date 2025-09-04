/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Switch;

import java.util.Scanner;

/**
 *
 * @author camil
 */
public class horas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese la hora (0-23)");
        int hora=teclado.nextInt();
        switch(hora){
            case 6,7,8,9,10,11,12:
                System.out.println("Buenos días");
                break;
            case 13,14,15,16,17,18,19,20:
                System.out.println("Buenas tardes");
                break;
            case 21,22,23,0,1,2,3,4,5:
                System.out.println("buenas noches");
                break;
            default:
                  System.out.println("entrada de hora no valida");
                
                
        }
        
    }
    
}
