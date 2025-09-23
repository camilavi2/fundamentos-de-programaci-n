/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;

import java.util.Scanner;

public class promedio { 
    public static void main(String[] args) { 
        
        int calificaciones [] = {9,8,8,7,10,9,8,10,9}; 
        int suma =0; 
        System.out.println("CALIFICACIONES: "); 
         
        for (int i : calificaciones) { 
            System.out.print(i + " | "); 
        } 
        for (int i=0; i<calificaciones.length; i++){ 
            suma += calificaciones[i]; 
        } 
        int total= calificaciones.length; 
        System.out.println("\n"+"Total de calificaciones " + total); 
        float promedio=suma/total; 
        System.out.println("El promedio de las calificaciones es " + promedio); 
      Scanner teclado=new Scanner (System.in);
     double suma2=0;
      System.out.println("¿ cuantas calificaciones desea ingresar?");
      int n=teclado.nextInt();
      double []calificaciones2=new double[n];
      for(int i=0;i<n;i++){
       System.out.println("Ingrese la calificacion");
       double cal=teclado.nextDouble();
       calificaciones2[i]=cal;
       suma2=suma2+calificaciones2[i];
      }
      //menor y mayor
      double menor=calificaciones2[0];
     double mayor=calificaciones2[0];
     for(int i=0;i<calificaciones2.length;i++){
     if(mayor<calificaciones2[i]){
   mayor=  calificaciones2[i];
     }
     if(menor>calificaciones2[i]){
   menor=  calificaciones2[i];
     }
     
     
     }
     System.out.println(" ");
    System.out.print("Las calificaciones son: ");
      for(int i=0;i<n;i++){
      System.out.print(calificaciones2[i]+","); 
    
    }
        System.out.println("La suma de las calificaciones es "+suma2);
          double prom=(suma2/calificaciones2.length);
         System.out.println("El promedio es `"+prom);
                  System.out.println("La calificacion mayor es "+mayor);
                                    System.out.println("La calificacion menor es "+menor);


    
    } 
} 