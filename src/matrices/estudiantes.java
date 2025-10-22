
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
public class estudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuantos alumnos hay?");
        int n = teclado.nextInt();
        System.out.println("¿Cuantas examenes se realizaron?");
        int m = teclado.nextInt();
        int[][] matriz = new int[n][m];

        System.out.println("Ingrese la calificacion obtenida por cada alumno en cada examen");
         for (int i = 0; i < n; i++) {
                         System.out.print("\nalumno " + (i+1) + " ");
        for (int j =0 ; j < m; j++) {
              System.out.println("\ncalificacion examen"+(j+1)+": ");
            matriz[i][j] = teclado.nextInt();
            }
    }

              for (int i = 0; i < n; i++) {
                         System.out.print("\nalumno " + (i+1) + ": ");
        for (int j =0 ; j <m; j++) {

                            System.out.print("  calificacion examen "+(j+1)+":  ");
              System.out.print(matriz[i][j]);


            }
        
    } 

    
for (int j = 0; j < n; j++) {
    double suma = 0;
    double promedio=0;
    for (int i = 0; i < m; i++) {
        suma=suma+ matriz[j][i];
    }
    promedio=suma/m;
   System.out.println( "\nPromedio alumno "+(j+1)+" ="+promedio);

}

double calmax = 0;   
double calmin = 10;  
int alumnos9y10=0;
int alumnos7=0;
for (int j = 0; j < n; j++) {
    double suma = 0;
    for (int i = 0; i < m; i++) {
        suma += matriz[j][i];
    }
double promedio = suma / m;
     if (promedio > calmax)
     { calmax = promedio;
}else{
    calmin = promedio;
     }

}

for (int j = 0; j < n; j++) {
    double suma = 0;
    for (int i = 0; i < m; i++) {
        suma += matriz[j][i];
    }
    double promedio = suma / m;
    if (promedio >= 9 && promedio <= 10) {
        alumnos9y10++;
    }else if(promedio<7){
        alumnos7++;
    
    }
}

double[][] prom1 = new double[2][alumnos9y10];
double [][]prom2=new double [2][alumnos7];
int col = 0; int col2=0;
for (int j = 0; j < n; j++) {
    double suma = 0;
    for (int i = 0; i < m; i++) {
        suma += matriz[j][i];
    }
    double promedio = suma / m;

    if (promedio >= 9 && promedio <= 10) {
        prom1[0][col] = j + 1;    
        prom1[1][col] = promedio;   
        col++;
    }else if(promedio<7){
    
    prom2[0][col2]=j+1;
     prom2[1][col2]=promedio;
col2++;
    }
}


System.out.print("\nAlumnos con el mejor promedio (" + calmax + "): ");
for (int j = 0; j < n; j++) {
   double suma = 0;
    for (int i = 0; i < m; i++) {
        suma += matriz[j][i];
    }
   double promedio = suma / m;
   if (promedio == calmax) {
        System.out.print("alumno"+(j + 1) + " ");
   }
}


System.out.print("\nAlumnos con el promedio mas bajo (" + calmin + "): ");
for (int j = 0; j < n; j++) {
    double suma = 0;
    for (int i = 0; i < m; i++) {
        suma += matriz[j][i];
    }
    double promedio = suma / m;
    if (promedio == calmin) {
        System.out.print("alumno"+(j + 1) + " ");
    }
}
System.out.println();
System.out.println("\nAlumnos con promedio entre 9 y 10:");
if (alumnos9y10 == 0) {
    System.out.println("Ninguno");
} else {
    for (int j = 0; j < alumnos9y10; j++) {
        System.out.println("Alumno " + (int)prom1[0][j] + " -> Promedio: " + prom1[1][j]);
    }
}

System.out.println("\nAlumnos con promedio menor que 7:");
if (alumnos7 == 0) {
    System.out.println("Ninguno");
} else {
    for (int j = 0; j < alumnos7; j++) {
        System.out.println("Alumno " + (int)prom2[0][j] + " -> Promedio: " + prom2[1][j]);
    }
}
double promax = 0;
double promin = 10;
int examenmax = 0;
int examenmin = 0;

for (int j = 0; j < m; j++) {
    double suma = 0;
    for (int i = 0; i < n; i++) {
        suma += matriz[i][j];
    }
    double promedioexamen = suma / n;

    if (promedioexamen > promax) {
        promax = promedioexamen;
        examenmax = j + 1;
    }

    if (promedioexamen < promin) {
        promin = promedioexamen;
        examenmin = j + 1;
    }
}


System.out.println("\nEl examen con el promedio más alto fue el examen " + examenmax + " con un promedio de " + promax);
System.out.println("El examen con el promedio más bajo fue el examen " + examenmin + " con un promedio de " + promin);
    }
    
}


