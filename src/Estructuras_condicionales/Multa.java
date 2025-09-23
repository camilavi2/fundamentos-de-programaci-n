/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Estructuras_condicionales;

import java.util.Scanner;
public class Multa {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
    String res;
    int velocidad;
    System.out.println("Ingrese la velocidad");
    velocidad= teclado.nextInt();
    System.out.println("Hoy es cumpleaños del conductor?");
    res=teclado.next();
    if(res.equals("si")){
    System.out.print("No hay multa");
    }else{
    if(velocidad<=60){
       
    System.out.println("0=sin multa");
    }else if(velocidad>=61 && velocidad <=80){
      
            System.out.println("1=multa pequeña");
    }else {
            System.out.println("2=multa grande");
    }
     }
    teclado.close();
    } 
    }
