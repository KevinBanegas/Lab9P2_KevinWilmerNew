/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Idioma {
    private int Id;
    private String NombreIdioma;
    private String ID_Juegos;

    public Idioma() {
    }

    public Idioma(int Id, String Nombres, String ID_Juegos) {
        this.Id = Id;
        this.NombreIdioma = Nombres;
        this.ID_Juegos = ID_Juegos;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombres() {
        return NombreIdioma;
    }

    public void setNombres(String Nombres) {
        this.NombreIdioma = Nombres;
    }

    public String getID_Juegos() {
        return ID_Juegos;
    }

    public void setID_Juegos(String ID_Juegos) {
        this.ID_Juegos = ID_Juegos;
    }

    @Override
    public String toString() {
        return "Juego{" + "Id=" + Id + ", Nombres=" + NombreIdioma + ", ID_Juegos=" + ID_Juegos + '}';
    }
    
    
}
