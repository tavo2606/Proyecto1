/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Tavo
 */
public class ClaseMusica extends ClaseCatalogo{
    
    ArrayList listaCanciones;
    
    public ClaseMusica(String nombre, String autor, String categoria, float precio, int cantDispo, ArrayList lista) {
        super(nombre, autor, categoria, precio, cantDispo);
        this.listaCanciones = lista;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\n"
                + "Autor: " + this.autor + "\n"
                + "Categoría: " + this.categoria + "\n"
                + "Precio: " + this.precio + "\n"
                + "Cantidad disponible:" + this.cantDispo + "\n"
                + "Lista de canciones: " + this.listaCanciones + "\n";
    }
}
