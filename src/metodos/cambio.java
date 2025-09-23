/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodos;

class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

public class cambio {

    public static String cambiarNombre(Persona persona, String nuevoNombre) {
        String nombreAnterior = persona.getNombre();  
        persona.setNombre(nuevoNombre);              
        return nombreAnterior;                      
    }

    public static void main(String[] args) {
    Persona persona = new Persona("Juan");
     String nombreAntes = cambiarNombre(persona, "Pedro"); 
        System.out.println("Nombre anterior: " + nombreAntes);
        System.out.println("Nombre cambiado: " + persona.getNombre());
    }
}