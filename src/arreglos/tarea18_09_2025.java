/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;

/**
 *
 * @author camil
 */
public class tarea18_09_2025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int[] numeros = {10, 20, 30, 40, 50}; 
     
System.out.println(numeros[2]); 
for (int numero : numeros) { 
System.out.print(numero+" "); 
}
 System.out.println(" ");
numeros[2] = 35;  // Cambia el tercer elemento a 35 
System.out.println(numeros[2]);
System.out.println(" ");
String nombres[]; 
nombres= new String [3]; 
nombres [0]="Uno"; 
nombres [1]="Dos"; 
nombres [2]="Tres"; 
System.out.println(nombres[0]);
String nombres2[]= new String [3]; 
nombres2 [0]="Uno"; 
nombres2 [1]="Dos"; 
nombres2 [2]="Tres"; 
System.out.println(nombres2[1]);

String nombres3[]= {"Uno","Dos","Tres"};
System.out.println(nombres3[2]);
// Array de cadenas 
String[] frutas = {"manzana", "plátano", "cereza"}; 
System.out.println(frutas[0]); 


    }
    
}
