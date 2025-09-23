/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;

import java.util.Scanner; 
public class Tienda { 
public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        String[] productos = {"Pan", "Leche", "Huevos", "Cereal", "Jugo"}; 
        double[] precios = {15.5, 22.0, 40.0, 55.5, 30.0}; 
        int[] cantidades = new int[productos.length]; 
 
        System.out.println("=== TIENDA ==="); 
       
        for (int i = 0; i < productos.length; i++) { 
            System.out.println((i + 1) + ". " + productos[i] + " - $" + 
precios[i]); 
        } 
 
        System.out.println("\nIngresa las cantidades deseadas:"); 
        for (int i = 0; i < productos.length; i++) { 
            System.out.print(productos[i] + ": "); 
            cantidades[i] = sc.nextInt(); 
        } 
 
        double total = 0; 
        System.out.println("\n=== DETALLE DE COMPRA ==="); 
        for (int i = 0; i < productos.length; i++) { 
            double subtotal = precios[i] * cantidades[i]; 
            total += subtotal; 
            System.out.println(productos[i] + " x " + cantidades[i] + " = $" + subtotal); 
        } 
 
        System.out.println("\nTotal a pagar: $" + total); 
        sc.close(); 
    } 
} 