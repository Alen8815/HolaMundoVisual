/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundovisual;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Persona {
    String nombre ; 
    String apellido;
    String telefono ;
    String sangre;
    String correo ;
    String direccion; 

    public Persona(String nombre, String apellido, String telefono, String sangre, String correo, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.sangre = sangre;
        this.correo = correo;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSangre() {
        return sangre;
    }

    public void setSangre(String sangre) {
        this.sangre = sangre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "SUS DATOS SON " + "\n nombre=" + nombre + "\n apellido=" + apellido + "\ntelefono=" + telefono + " \nsangre=" + sangre + "\ncorreo=" + correo + "\ndireccion=" + direccion ;
    }

  
}
