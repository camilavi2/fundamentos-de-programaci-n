package Switch;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
public class cine {
    public static void main(String[] args) {
    Scanner teclado= new Scanner (System.in);
    String dia, res;
    int personas;
    int precio=0;
    double total=0;
     boolean diaValido=false;
    System.out.println("Ingrese el número de personas ");
    personas=teclado.nextInt();
    System.out.println("ingrese el día de la semana");
    dia=teclado.next().toLowerCase();
    switch(dia){
        case "lunes", "martes", "viernes", "sabado","domingo":
        diaValido = true;
        precio=50;
        total=personas*precio;
        break;
        case "miercoles":
            diaValido=true;
            precio=30;
            total=personas*precio;
            break;
        case "jueves":
            diaValido=true;
           int parejas=0;
            if(personas %2==0){
            parejas=personas/2;
            precio=75;
            total=precio*parejas;
            }else if(personas>1 && personas % 2!=0){
                parejas=(personas-1)/2;
                total=parejas*75+50;
                System.out.println("Queda 1 persona pagando precio individual de $50"); 
            }else if(personas==1){
                total=50;
                System.out.println("El precio individual es de "+total);
            
            }
            System.out.println("El precio del boleto por pareja es de $75");
            System.out.println("Se formaron "+parejas+" parejas.");
break;
        default:
        System.out.println("Entrada de día no valida");
        diaValido=false;
        break;
    }
   if(diaValido==true){
         System.out.println("¿Cuentas con membresia(si/no)?");
         res=teclado.next().toLowerCase();
         if(res.equals("no")){
            System.out.println("El total a pagar por "+personas+" personas es $"+total);
         }else if(res.equals("si")){
             total=total*0.90;
            System.out.println("El total a pagar por "+personas+ " personas es $"+total);

         }else{
                 System.out.println("Respuesta no valida");
         }
  	
   }
    
    }
    
}
