/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author camil
 */
public class promedio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("ingrese cuantas calificaciones desea ingresar");
        int n=teclado.nextInt();
      float []calificaciones=new float[n];
      float suma = 0; 
       for(int i=0;i<n;i++){
       System.out.println("Ingrese la calificacion");
       float cal=teclado.nextFloat();
       calificaciones[i]=cal;
       suma=suma+calificaciones[i];
      }
        
   
 
        float promedio = (suma / calificaciones.length); 
 
        System.out.println("=== CALIFICACIONES ==="); 
        
        for (double i : calificaciones) { 
            System.out.print(i + "  "); 
        } 
        System.out.println(" ");
             double max = calificaciones[0]; 
        double min = calificaciones[0]; 
 int reprobadas=0;
        for (int i = 0; i < calificaciones.length; i++) { 
       
 
            if (calificaciones[i] > max) { 
                max = calificaciones[i]; 
            } 
            if (calificaciones[i] < min) { 
                min = calificaciones[i]; 
            } 
            if(calificaciones[i]<7){
            System.out.println("Calificacion reprobatoria: "+calificaciones[i]);
            reprobadas++;
            }
        } 
         
        System.out.println("\nPromedio: " + promedio); 
        System.out.println("Calificación máxima: " + max); 
        System.out.println("Calificación mínima: " + min);
                System.out.println("Calificaciónes reprobatorias: " + reprobadas);

        
    }    }
    

