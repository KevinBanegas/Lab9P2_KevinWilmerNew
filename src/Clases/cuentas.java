/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author wilme
 */
public class cuentas {
    private int ID;
    private String Usuario;
    private String Nombre;
    private String Contraseña;
    private int Edad;
    private String Correo;

    public cuentas() {
    }

    public cuentas(int ID, String Usuario, String Nombre, String Contraseña, int Edad, String Correo) {
        this.ID = ID;
        this.Usuario = Usuario;
        this.Nombre = Nombre;
        this.Contraseña = Contraseña;
        this.Edad = Edad;
        this.Correo = Correo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    @Override
    public String toString() {
        return "cuentas{" + "ID=" + ID + ", Usuario=" + Usuario + ", Nombre=" + Nombre + ", Contraseña=" + Contraseña + ", Edad=" + Edad + ", Correo=" + Correo + '}';
    }
    
    
}
