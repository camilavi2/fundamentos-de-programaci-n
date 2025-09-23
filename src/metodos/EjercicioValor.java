/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodos;

/**
 *
 * @author camil
 */
public class EjercicioValor { 
 
    // Método que intenta intercambiar dos enteros 
    public static void intercambiar(int a, int b) { 
        int temp = a; 
        a = b; 
        b = temp; 
System.out.println("Dentro del método -> a: " + a + ", b: " + b); 
    }
 public static void main(String[] args) { 
        int x = 5; 
        int y = 10; 
 
 System.out.println("Antes del método -> x: " + x + ", y: " + y); 
        intercambiar(x, y); 
System.out.println("Después del método -> x: " + x + ", y: " + y); 
    } 
} 