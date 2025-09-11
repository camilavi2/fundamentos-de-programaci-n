/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclostarea;

import java.util.Scanner;
public class meses {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
      int num;
      String repetir="si";
      while(repetir.equals("si")){
      System.out.println("Ingrese un número correspondiente al mes o el numero de días para mostrar los meses corresopondientes ");
      num=teclado.nextInt();
      switch(num){
         case 1:
             System.out.println("enero");
              break;
         case 2:
             System.out.println("febrero");
             break;
         case 3:
             System.out.println("marzo");
             break;
         case 4:
             System.out.println("abril");
             break;
         case 5:
             System.out.println("mayo");
             break;
         case 6:
             System.out.println("junio");
             break;
         case 7:
             System.out.println("julio");
             break;
         case 8:
             System.out.println("agosto");
             break;
         case 9:
             System.out.println("septiembre");
             break;
         case 10:             
             System.out.println("octubre");
             break;
         case 11:
             System.out.println("noviembre");
             break;
         case 12:
             System.out.println("diciembre");
             break;
         case 28:
             System.out.println("febrero");
             break;
         case 30:
             System.out.println(" abril \n junio \n septiembre \n noviembre ");
  
            
             break;
         case 31:
             System.out.println(" enero \n marzo \n mayo \n julio \n agosto \n octubre \n diciembre");
   
             break;
         default: 
             System.out.println("Entrada no valida");
             break;
    }
      System.out.println("Desea repetir el proceso?(si/no)");
      repetir=teclado.next().toLowerCase();
      }
      
    }
    
}
