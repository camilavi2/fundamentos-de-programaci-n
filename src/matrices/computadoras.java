/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;

import java.util.Scanner;

/**
 *
 * @author camil
 */
public class computadoras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuantos vendedores hay?");
        int n = teclado.nextInt();
        System.out.println("¿Cuantas zonas de venta hay?");
        int m = teclado.nextInt();
        int[][] matriz = new int[n][m];

 System.out.println("¿Cual es el precio de las computadoras?");
        int p = teclado.nextInt();
        System.out.println("Ingrese la cantidad de computadoras vendidas por cada trabajador en cada zona");
         for (int i = 0; i < n; i++) {
                         System.out.print("\nVendedor " + (i+1) + " ");
        for (int j =0 ; j < m; j++) {
              System.out.println("\nComputadoras vendidas en la zona "+(j+1)+": ");
            matriz[i][j] = teclado.nextInt();
            }
    }

              for (int i = 0; i < n; i++) {
                         System.out.print("\nVendedor " + (i+1) + ": ");
        for (int j =0 ; j <m; j++) {

                            System.out.print("  zona "+(j+1)+":  ");
              System.out.print(matriz[i][j]);


            }
        
    } 
    int total=0;          
for (int j = 0; j < m; j++) {
    int totalz = 0;
    for (int i = 0; i < n; i++) {
        totalz=totalz+ matriz[i][j];
    }
   System.out.println( "\nTzona "+(j+1)+" ="+totalz);
   total=total+totalz;
}
    int total2=0;     
for (int j = 0; j < n; j++) {
    int totalv = 0;
    for (int i = 0; i < m; i++) {
        totalv=totalv+ matriz[j][i];
    }
   System.out.println( "\nTvendedor "+(j+1)+" ="+totalv);
   total2=total2+totalv;
}
   System.out.println( "\nEl total de computadoras vendidas por todas las zonas es= "+total);
int totalx = 0;
int vendedorm = 0, vendedormin = 0;
int ventam = 0, ventamin = Integer.MAX_VALUE;

for (int j = 0; j < n; j++) {
    int totalv = 0;
    for (int i = 0; i < m; i++) {
        totalv = totalv + matriz[j][i];
    }
    totalx = totalx + totalv;

    if (totalv > ventam) {
        ventam = totalv;
        vendedorm = j;
    }

    if (totalv < ventamin) {
        ventamin = totalv;
        vendedormin = j;
    }
}


System.out.println("\nEl vendedor que más computadoras vendio fue el vendedor " + (vendedorm+ 1) + " con " + ventam + " computadoras y un total de ."+(ventam*p));
System.out.println("El vendedor que menos computadoras vendio fue el vendedor " + (vendedormin + 1) + " con " + ventamin + " computadoras y un total de ."+(ventamin*p));
int maxz = 0;
int maxventa = 0;

for (int j = 0; j < m; j++) {
    int totalz = 0;
    for (int i = 0; i < n; i++) {
        totalz += matriz[i][j];
    }

    if (totalz > maxventa) {
        maxventa = totalz;
        maxz = j; 
    }
}
System.out.println("\nLa zona que vendio mas computadoras fue la zona " + (maxz + 1) + " con " + maxventa + " computadoras.");

    }
    
}
