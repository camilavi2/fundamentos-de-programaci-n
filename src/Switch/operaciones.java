/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Switch;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author camil
 */
public class operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
         DecimalFormat df= new DecimalFormat("#.00");
   double num1,num2;
   double res;

   String signo;
   System.out.println("Ingrese dos números");
   num1=teclado.nextDouble();
   num2=teclado.nextDouble();
   System.out.println("Ingrese el signo de operación (+,-,/,*)");
signo=teclado.next();
   switch(signo){
       case "+":
           res=num1+num2;
           System.out.println("El resultado de la suma es "+res);
           break;
       case "-":
           res=num1-num2;
           System.out.println("El resultado de la resta es "+res);
           break;
       case "*":
           res=num1*num2;
           System.out.println("El resultado de la multiplicación es "+res);
           break;
       case "/":
           if(num2==0){
                      System.out.println("Error: División entre cero ");
           }else{
           res=num1/num2; 
           String resultado= df.format(res);
                      System.out.println("El resultado de la división es "+resultado);
                        

           }
           break;
       default:
           System.out.println("Signo de operación no valido");
   break;
   
   
   }
           
    }
    
}
