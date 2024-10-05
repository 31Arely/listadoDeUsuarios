/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package igsw.uaz.sgg.domain;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author Arely
 */
@Entity
public class Usuario implements Serializable {

    int idUsuario;
    String nombre;
    String apellido;
    String edad;
    String tipoDeMembresia;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombre, String apellido, String edad, String tipoDeMembresia) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tipoDeMembresia = tipoDeMembresia;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTipoDeMembresia() {
        return tipoDeMembresia;
    }

    public void setTipoDeMembresia(String tipoDeMembresia) {
        this.tipoDeMembresia = tipoDeMembresia;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", tipoDeMembresia=" + tipoDeMembresia + '}';
    }
 
    
}

