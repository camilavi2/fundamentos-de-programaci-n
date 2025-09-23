/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodos;

class Caja { 
    int valor; 
} 
 
public class ParametrosReferencia { 
 
    public static void duplicar(Caja c) { 
        c.valor = c.valor * 2; // modificamos atributo del objeto 
        System.out.println("Dentro del método: " + c.valor); 
    } 
 
    public static void main(String[] args) { 
        Caja miCaja = new Caja(); 
        miCaja.valor = 10; 
 
        System.out.println("Antes de llamar al método: " + 
miCaja.valor); 
        duplicar(miCaja); 
        System.out.println("Después de llamar al método: " + 
miCaja.valor); 
    } 
} 
 