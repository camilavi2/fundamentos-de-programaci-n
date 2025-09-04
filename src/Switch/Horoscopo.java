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
public class Horoscopo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese su día de nacimiento");
        int dia=teclado.nextInt();
        System.out.println("Ingrese su mes de nacimiento (enero...)");
        String mes=teclado.next().toLowerCase();
        switch(mes){
            case "enero":
                if(dia>=1&& dia<=19){
                  System.out.println("Su signo es Capricornio ");

                }else if(dia>=20 && dia<=31){
                  System.out.println("Su signo es Acuario");
                }else{
                 System.out.println("Día no valido");
                }
              
                break;
                       case "febrero":
                if(dia>=1&& dia<=18){
                  System.out.println("Su signo es Acuario ");

                }else if(dia>=19 && dia<=29){
                  System.out.println("Su signo es Piscis");
                }else{
                 System.out.println("Día no valido");
                }
                break;
            case "marzo":
                if(dia>=1 && dia<=20){
                  System.out.println("Su signo es piscis ");

                }else if(dia>=21 && dia<=31){
                  System.out.println("Su signo es Aries");
                }else{
                 System.out.println("Día no valido");
                }
              
                break;
            case "abril":
                if(dia>=1&& dia<=19){
                  System.out.println("Su signo es Aries");

                }else if(dia>=20 && dia<=30){
                  System.out.println("Su signo es Tauro");
                }else{
                 System.out.println("Día no valido");
                }
              
                break; 
            case "mayo":
                if(dia>=1&& dia<=20){
                  System.out.println("Su signo es Tauro ");

                }else if(dia>=21 && dia<=31){
                  System.out.println("Su signo es Geminis");
                }else{
                 System.out.println("Día no valido");
                }
              
                break;  
            case "junio":
                if(dia>=1&& dia<=20){
                  System.out.println("Su signo es Geminis ");

                }else if(dia>=21 && dia<=31){
                  System.out.println("Su signo es Cancer");
                }else{
                 System.out.println("Día no valido");
                }
              
                break; 
            case "julio":
                if(dia>=1&& dia<=22){
                  System.out.println("Su signo es Cancer ");

                }else if(dia>=23 && dia<=31){
                  System.out.println("Su signo es Leo");
                }else{
                 System.out.println("Día no valido");
                }
              
                break;
            case "agosto":
                if(dia>=1&& dia<=22){
                  System.out.println("Su signo es Leo ");

                }else if(dia>=23 && dia<=31){
                  System.out.println("Su signo es Virgo");
                }else{
                 System.out.println("Día no valido");
                }
              
                break; 
            case "septiembre":
                if(dia>=1&& dia<=22){
                  System.out.println("Su signo es Virgo");

                }else if(dia>=23 && dia<=30){
                  System.out.println("Su signo es Libra");
                }else{
                 System.out.println("Día no valido");
                }
              
                break;                
             case "octubre":
                if(dia>=1&& dia<=22){
                  System.out.println("Su signo es Libra ");

                }else if(dia>=23 && dia<=31){
                  System.out.println("Su signo es Escorpio");
                }else{
                 System.out.println("Día no valido");
                }
              
                break;
            case "noviembre":
                if(dia>=1&& dia<=21){
                  System.out.println("Su signo es Escorpio ");

                }else if(dia>=22 && dia<=30){
                  System.out.println("Su signo es Sagitario");
                }else{
                 System.out.println("Día no valido");
                }
              
                break;  
            case "diciembre":
                if(dia>=1&& dia<=21){
                  System.out.println("Su signo es Sagitario");

                }else if(dia>=22 && dia<=31){
                  System.out.println("Su signo es Capricornio");
                }else{
                 System.out.println("Día no valido");
                }
              
                break;                
            default:
                  System.out.println("entrada de mes no valida");
                
                
        }
    }
    
}
