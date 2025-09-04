/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author camil
 */
public class Examen1 {

   public static void main(String[] args) {
      Scanner teclado= new Scanner(System.in);
      int clave;
      double materia;
      double  Cproduccion=0;
      double Pventa=0;
      double Cmobra=0;
      double Gfabricacion=0;
      boolean cDisponible=false;
     DecimalFormat df= new DecimalFormat("#.00");
       System.out.println("Ingrese el costo de la materia prima"); 
      materia=teclado.nextDouble();
      System.out.println("Ingrese la clave del producto a calcular el precio (1-6)");
      clave=teclado.nextInt();
      switch (clave){
          case 3,4:
               cDisponible=true;
             Cmobra=materia*0.75; 
            
             System.out.println("lol");
              break;
          case 1,5:
              Cmobra=materia*0.80;
             cDisponible=true;
              break;
          case 2,6:
              Cmobra=materia*0.85;
              cDisponible=true;
              break;
          default:
              cDisponible=false;
              System.out.println("Clave no disponible");
              break;
      }
      if(clave==2 || clave==5){
      Gfabricacion=materia*0.30;
      }else if(clave==1 || clave==4){
      Gfabricacion=materia*0.28;
      }
     if (cDisponible==true){
      Cproduccion=materia+Cmobra+Gfabricacion;
      Pventa=Cproduccion+(Cproduccion*0.45);
      String Cproduccion1= df.format(Cproduccion);
      String Pventa1= df.format(Pventa);


      System.out.println("El costo de produccion es "+Cproduccion1);
      System.out.println("El precio de venta es "+Pventa1);
     }
    }
    
}
