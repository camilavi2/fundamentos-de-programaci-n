package metodos;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author camil
 */
public class ejemplos {


    public static void saludar() {
        Scanner teclado = new Scanner(System.in);
         String nombre;
     String res;
        do {
            System.out.print("Ingresa tu nombre: ");
             nombre = teclado.next();
         System.out.println("¡Hola, " + nombre + "!");
        System.out.print("¿Deseas repetir el saludo? (si/no): ");
           res = teclado.next();
        } while (res.equals("si"));
    }

  
    public static void multiplicar() {
        Scanner teclado = new Scanner(System.in);
        int a, b;
         String res;
        do {
       System.out.print("Ingresa el primer número a multiplicar: ");
        a = teclado.nextInt();
            System.out.print("Ingresa el segundo número a multiplicar: ");
        b = teclado.nextInt();
            int resultado = a * b;
         System.out.println("La multiplicación de " + a + " y " + b + " es: " + resultado);            System.out.print("¿Deseas realizar otra multiplicación? (si/no): ");
            res = teclado.next();
        } while (res.equals("si"));
    }

   
    public static void duplicar() {
        Scanner teclado = new Scanner(System.in);
        int numero;
         String res;
        do {
        System.out.print("Ingresa un número para duplicar: ");
            numero = teclado.nextInt();
         System.out.println("Número dentro del método: " + numero);
           numero = numero * 2;
           System.out.println("Número duplicado: " + numero);
             System.out.print("¿Deseas ingresar otro número para duplicar? (si/no): ");
           res = teclado.next();
      
        } while (res.equals("si"));
    }

    public static void obtenerNombreUsuario() {
        Scanner teclado = new Scanner(System.in);
        String nombreUsuario; String res;
        do {
         System.out.print("Por favor, ingresa tu nombre: ");
             nombreUsuario = teclado.next();
         System.out.println("¡Hola, " + nombreUsuario + "!");
          System.out.print("¿Deseas ingresar otro nombre? (si/no): ");
            res = teclado.nextLine();
        } while (res.equals("si"));
    }

    public static void saludar2() {
        Scanner teclado = new Scanner(System.in);
        String nombre2;
        String res;
        do {
            System.out.print("Ingresa tu nombre: ");
        nombre2 = teclado.next();
             System.out.println("¡Hola, " + nombre2 + "!");
           System.out.print("¿Deseas repetir el saludo? (si/no): ");
            res = teclado.next();
        } while (res.equals("si"));
    }


    public static void sumar() {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        String res;
        do {
        System.out.print("Ingresa el primer número: ");
            num1 = teclado.nextInt();
        System.out.print("Ingresa el segundo número : ");
         num2 = teclado.nextInt();
            int suma = num1 + num2;
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
       System.out.print("¿Deseas realizar otra suma? (si/no): ");
           res = teclado.next();
        } while (res.equals("si"));
    }

    public static void imprimirDatos() {
        Scanner teclado = new Scanner(System.in);
        String nombre3;
        int edad;
        String res;
        do {
      System.out.print("Ingresa tu nombre: ");
         nombre3 = teclado.nextLine();
         
      System.out.print("Ingresa tu edad: ");
          edad = teclado.nextInt();
         System.out.println("Nombre: " + nombre3);
                 System.out.println("Edad: " + edad);
            System.out.print("¿Deseas repetir e ingresar otros datos? (si/no): ");
        res=teclado.next();
        } while (res.equals("si"));
    }

    public static void main(String[] args) {
        saludar();
        multiplicar(); 
        duplicar(); 
        obtenerNombreUsuario(); 
        saludar2(); 
        sumar(); 
        imprimirDatos(); 
    }
}
