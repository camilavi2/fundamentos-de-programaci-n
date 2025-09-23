/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodos;

/**
 *
 * @author camil
 */
public class ParametrosValor {

 
 public static void duplicar(int numero) { 
numero = numero * 2; 
System.out.println("Dentro del método: " + numero); 
} 
public static void main(String[] args) { 
int x = 10; 
System.out.println("Antes de llamar al método: " + x); 
duplicar(x); 
System.out.println("Después de llamar al método: " + x); 
}

}
