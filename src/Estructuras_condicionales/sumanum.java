/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Estructuras_condicionales;

import java.util.Scanner;

public class sumanum {

    public static void main(String[] args) {
      Scanner teclado= new Scanner(System.in);
      int a, b, c, res;
      a=teclado.nextInt();
      b=teclado.nextInt();
      c=teclado.nextInt();
 
      if(a+b==10 || b+c==10 || a+c==10){
      res=10;
      System.out.println("El resultado es "+res);
      }else if(a+b==(b+c+10)|| a+b==(a+c+10)){
          res=5;
      System.out.println("El resultado es "+res);
      }else{
          res=0;
            System.out.println("El resultado es "+res);

      }
      
    }
    
}
