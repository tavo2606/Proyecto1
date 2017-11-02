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
    String cedula;
    String contra;
    String correo;
    
    public ClaseCliente(String n, String c, String p, String e) {
        this.nombre = n;
        this.cedula = c;
        this.contra = p;
        this.correo = e;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + this.nombre + "\n" + 
                "Cedula: " + this.cedula + "\n" +
                "Correo electrónico: " + this.correo + "\n";
    }
}
