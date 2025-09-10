/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclos;

/**
 *
 * @author camil
 */
public class uno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int n=1;
      int resultado=0;
      while(n<10){
      resultado=resultado+n;
      n++;
      System.out.println(resultado);
          
      }
        System.out.println("While");
      n=1;
      resultado=0;
      do{
           resultado=resultado+n;
      n++;
      System.out.println(resultado);
      }while(n<10);
              System.out.println("do-While");
          resultado=0;
          for(n=1; n<10; n++)
          {
          resultado=resultado+n;
      System.out.println(resultado);
          }
                  System.out.println("for");
    }
    
}
