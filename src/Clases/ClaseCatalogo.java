package Clases;

public class ClaseCatalogo {
    String nombre;
    String autor;
    String categoria;
    float precio;
    int cantDispo;

    public ClaseCatalogo(String nombre, String autor, String categoria, float precio, int cantDispo) {
        this.nombre = nombre;
        this.autor = autor;
        this.categoria = categoria;
        this.precio = precio;
        this.cantDispo = cantDispo;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + this.nombre + "\n"
                + "Autor: " + this.autor + "\n"
                + "Categoría: " + this.categoria + "\n"
                + "Precio: " + this.precio + "\n"
                + "Cantidad disponible:" + this.cantDispo + "\n";
    }
}
