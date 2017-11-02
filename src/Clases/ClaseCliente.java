/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Tavo
 */
public class ClaseCliente {
    String nombre;
    String contra;
    String cedula; 
    String correo;
    
    public ClaseCliente(String n, String p, String c, String e) {
        this.nombre = n;
        this.contra = p;
        this.cedula = c;  
        this.correo = e;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + this.nombre + "\n" + 
                "Cedula: " + this.cedula + "\n" +
                "Correo electrónico: " + this.correo + "\n";
    }
}
