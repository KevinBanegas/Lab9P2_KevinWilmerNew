/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Juego {
    private int Id;
    private String Categoria;
    private int Costo;
    private String Nombre;

    public Juego() {
    }

    public Juego(int Id, String Categoria, int Costo, String Nombre) {
        this.Id = Id;
        this.Categoria = Categoria;
        this.Costo = Costo;
        this.Nombre = Nombre;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public int getCosto() {
        return Costo;
    }

    public void setCosto(int Costo) {
        this.Costo = Costo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Juego{" + "Id=" + Id + ", Categoria=" + Categoria + ", Costo=" + Costo + ", Nombre=" + Nombre + '}';
    }

    
}
