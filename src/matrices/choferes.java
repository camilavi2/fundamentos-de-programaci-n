/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;

import java.util.Scanner;

public class choferes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántos trabajadores tiene en la empresa?");
        int t = teclado.nextInt();

        String[][] matriz = new String[t + 1][12];

        matriz[0][0] = "Nombre";
        matriz[0][1] = "Lunes";
        matriz[0][2] = "Martes";
        matriz[0][3] = "Miercoles";
        matriz[0][4] = "Jueves";
        matriz[0][5] = "Viernes";
        matriz[0][6] = "Sabado";
        matriz[0][7] = "Domingo";
        matriz[0][8] = "Sueldo*hora";
        matriz[0][9] = "Descanso";
matriz[0][10]="Horas(t)";
matriz[0][11]="Salario(t)";

        System.out.println("Escriba la información de cada trabajador:");
        System.out.println("Nombre horas trabajadas (lunes a domingo y sueldo por hora.");

        for (int j = 1; j <= t; j++) {
            System.out.println("\nTrabajador " + j + ":");

              System.out.print("Nombre: ");
            matriz[j][0] = teclado.next();
        
            for (int i = 1; i <= 7; i++) {
                System.out.print(matriz[0][i] + " (horas): ");
                matriz[j][i] = teclado.next();
            }

     
            System.out.print("Sueldo por hora: ");
            matriz[j][8] = teclado.next();

           String descanso;
                int  total=0;
            for (int i = 1; i <= 7; i++) {
                int horas = Integer.parseInt(matriz[j][i]);
               total=horas+total;
                if (horas == 0) {
                     descanso=matriz[0][i];
                      matriz[j][9]=descanso;
                }
       int sueldo=Integer.parseInt(matriz[j][8]);
       int salario=total*sueldo;
       String salarioS=String.valueOf(salario);
String totalH = String.valueOf(total);

matriz[j][10]=totalH;
matriz[j][11]=salarioS;



            }
          
        }

        System.out.println("\nInformación de los trabajadores:\n");
        for (int i = 0; i <= 11; i++) {
            System.out.print("[" + matriz[0][i] + "]");
        }
        System.out.println();

        for (int j = 1; j <= t; j++) {
            for (int i = 0; i <= 11; i++) {
                System.out.print("[" + matriz[j][i] + "]     ");
            }
            System.out.println();
        }
int empresaT=0;
for (int  i=1;i<=t;i++){
int spe=Integer.parseInt(matriz[i][11]);
empresaT=empresaT+spe;
}
System.out.println("El total de dinero que pagara la empresa a todos sus trabajadores es:"+empresaT);
    int mayor= 0;
String trabajador = "";

for (int j = 1; j <= t; j++) {
    int horasL = Integer.parseInt(matriz[j][1]);

    if (horasL > mayor) {
        mayor = horasL;
        trabajador = matriz[j][0]; 
    }
}
System.out.println(" El trabajador que trabajo mas horas en lunes es: " 
                   + trabajador + " con " + mayor + " horas.");
    }
}
