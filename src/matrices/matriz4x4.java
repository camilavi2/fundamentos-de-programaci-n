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
public class matriz4x4 {

    /**
     * @param args the command line arguments
     */
    public static void recorrer(int[][]matriz){

        System.out.println("Los números en la matriz son:");
        for (int i = 0; i < 4; i++) {
            for (int j=0;j<4;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
}
     public static boolean vacia(int[][] matriz) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] != 0) {
                    return false; 
                }
            }
        }
        return true; 
    }
     public static void tresycuatro(int[][] matriz, int f, int op){
        Scanner teclado=new Scanner (System.in);
         boolean valido=false;
do{
    if(f>4||f<1){System.out.println("Ingrese una posicion valida");
   f=teclado.nextInt();
    }else{ 
        valido=true;
         int totalfe=0;  
 int totalce=0;
            for (int j=0;j<4;j++){
                totalce=totalce+matriz[j][f-1];
       totalfe=totalfe+matriz[f-1][j];
            }  if(op==3){ System.out.println("La suma de la fila "+f+" es "+totalfe);}else{
             System.out.println("La suma de la columna "+f+" es "+totalce);
            }}}while(valido==false);
     }
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int[][] matriz = new int[4][4];
        String res="si";
     
do{


    System.out.println("Seleccione una opción:");
System.out.println("1=rellenar matriz");
System.out.println("2=suma de filas y columnas");
System.out.println("3=suma de fila elegida");
System.out.println("4=suma de columna elegida");
System.out.println("5=mayor y menor valor");
System.out.println("6=pares");
System.out.println("7=impares");
System.out.println("8=matriz cuadrada");
System.out.println("9=suma diagonal principal");
System.out.println("10=suma diagonal inversa");
System.out.println("11=media");
int op=teclado.nextInt();

switch(op){

    case 1:
            for (int i = 0; i < 4; i++) {
            for (int j=0;j<4;j++){
            System.out.println("Ingrese un número: ");
            int numero = teclado.nextInt();
            matriz[i][j] = numero;
         
        }
            }
                recorrer(matriz);  

        break;
    case 2:
              if(vacia(matriz)){
                System.out.println("La matriz aun esta vacia, rellenela");
                }else{
                  
                  recorrer(matriz);
                
                for (int i = 0; i < 4; i++) {
                   int totalf=0;  
                    int totalc=0;
            for (int j=0;j<4;j++){
       totalf=totalf+matriz[i][j];
 totalc=totalc+matriz[j][i];
            } 
                                   System.out.println("La suma de la fila "+(i+1)+" es "+totalf);
                                       System.out.println("La suma de la columna "+(i+1)+" es "+totalc);
                }


            }              
        break;
    case 3:
         if(vacia(matriz)){
                System.out.println("La matriz aun esta vacia, rellenela");
                }else{
         recorrer(matriz);
         System.out.println("ingrese la fila a sumar");
         int f=teclado.nextInt();
tresycuatro(matriz,f,op);
                }
                               
        break;
    case 4:
          if(vacia(matriz)){
                System.out.println("La matriz aun esta vacia, rellenela");
                }else{
         recorrer(matriz);
         System.out.println("ingrese la columna a sumar");
         int f=teclado.nextInt();
tresycuatro(matriz,f,op);
                }
        break;
    case 5:
    if (vacia(matriz)) {
        System.out.println("La matriz aun esta vacia, rellenela).");
    } else {
        int mayor = matriz[0][0]; 
        int menor = matriz[0][0]; 

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        System.out.println("El numero mayor en la matriz es: " + mayor);
        System.out.println("El numero menor en la matriz es: " + menor);
    }
    break;
    case 6:
         int pares=0;
         int impares=0;
        for (int i = 0; i < 4; i++) {
            for (int j=0;j<4;j++){
              if( matriz[i][j]%2==0){
              pares=pares+1;
              }else{
              impares=impares+1;
              };
            }
        }
         System.out.println(" La cantidad de numeros pares es: "+pares);
                        System.out.println(" La cantidad de numeros impares es: "+impares);
                               
        break;
    case 7:
        int [][]elevados=new int [4][4];
                for (int i = 0; i < 4; i++) {
            for (int j=0;j<4;j++){
               
               elevados[i][j]=matriz[i][j]*matriz[i][j];
            }
            }
                recorrer(elevados);
                recorrer(matriz);
        break;
     case 8:
         recorrer(matriz);
         int sumad1=0;
         for (int i = 0; i < 4; i++) {
          sumad1=sumad1+matriz[i][i];
      
        }
         System.out.println("la suma se la diagonal principal es "+sumad1);
      
         break;
    case 9:
         recorrer(matriz);
         int sumad2=0;
      int j=0;
         for (int i = matriz.length-1; i>=0&&i<4; i--) {
          sumad2=sumad2+matriz[i][j];
          j++;
        }
         System.out.println("la suma se la diagonal inversa es "+sumad2);
      
        break;        
     case 10:
recorrer(matriz);
         float total=0;
        for (int i = 0; i < 4; i++) {
            for (int k=0;k<4;k++){
            total=total+ matriz[i][k];
            
            }
        }
        float promedio;
        promedio = total/16;
                    System.out.println("La media de los numeros es "+promedio);

        break; 
    
    default:
        System.out.println("Opcion no valida");
              
}
System.out.println("Desea realizar otra operacion?(si/no)");
res=teclado.next();
    while (!res.equalsIgnoreCase("si") && !res.equalsIgnoreCase("no")) {
        System.out.println("Respuesta no valida. Ingrese (si / no");
        res = teclado.next();
    }

}while(res.equals("si"));
    }
    
}
