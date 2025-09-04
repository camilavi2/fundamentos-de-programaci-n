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
public class Areas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
          DecimalFormat df= new DecimalFormat("#.00");
   String figura;
 
  System.out.println("Ingrese el nombre de la figura de la cual se calculara el area (/cuadrado, rectangulo, triangulo, circulo)");
figura=teclado.next().toLowerCase();
   switch(figura){
       case "cuadrado":
           System.out.println("Ingrese la medida del lado");
           double lado=teclado.nextDouble();
           double area=lado*lado;
            String resultado= df.format(area);
           System.out.println("El area del cuadrado es "+resultado);
           break;
       case "rectangulo":
            System.out.println("Ingrese la medida de la base y altura");
          double base=teclado.nextDouble();
          double altura=teclado.nextDouble();
          area=base*altura;
          resultado= df.format(area);
           System.out.println("El area del rectangulo es "+resultado);
           break;
       case "triangulo":
         System.out.println("Ingrese la medida de la base y altura");
          base=teclado.nextDouble();
         altura=teclado.nextDouble();
          area=(base*altura)/2;
        resultado= df.format(area);
           System.out.println("El area del triangulo es "+resultado);
           break;
       case "circulo":
         System.out.println("Ingrese la medida del radio");
          double radio=teclado.nextDouble();
          area=Math.PI * Math.pow(radio, 2);
         resultado= df.format(area);
           System.out.println("El area del circulo es "+resultado);
       break;
       default:
           System.out.println("Entrada no valida");
   break;
   
   
   }
    }
    
}
