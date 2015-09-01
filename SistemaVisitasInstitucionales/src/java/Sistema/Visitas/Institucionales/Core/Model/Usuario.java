/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.Visitas.Institucionales.Core.Model;

import java.util.List;

/**
 *
 * @author Robert Bonilla
 */
public class Usuario {
     int id;
    String nombre;
    String apellido;
    String correo;
    String usuario;
    int id_rol;
    String telefono;
    String contraseña;
    int id_escuela;
    boolean tiempoCompleto;
    Rol listRol;
    Escuela listEscuela;

    public Usuario() {
    }

    public Usuario(int id, String nombre, String apellido, String correo, String usuario, int id_rol, String telefono, String contraseña,int escuela,boolean tCompleto) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.usuario = usuario;
        this.id_rol = id_rol;
        this.telefono = telefono;
        this.contraseña = contraseña;
        this.id_escuela = escuela;
        this.tiempoCompleto = tCompleto;
    }
      public Usuario(int id, String nombre, String apellido, String correo, String usuario, int id_rol, String telefono, String contraseña,int escuela,boolean tCompleto,Rol listRol,Escuela listEscuela) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.usuario = usuario;
        this.id_rol = id_rol;
        this.telefono = telefono;
        this.contraseña = contraseña;
        this.id_escuela = escuela;
        this.tiempoCompleto = tCompleto;
        this.listEscuela = listEscuela;
        this.listRol = listRol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContraseña() {
        return contraseña;
    }

    public Rol getListRol() {
        return listRol;
    }

    public void setListRol(Rol listRol) {
        this.listRol = listRol;
    }

    public Escuela getListEscuela() {
        return listEscuela;
    }

    public void setListEscuela(Escuela listEscuela) {
        this.listEscuela = listEscuela;
    }


    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getId_escuela() {
        return id_escuela;
    }

    public void setId_escuela(int id_escuela) {
        this.id_escuela = id_escuela;
    }

    public boolean isTiempoCompleto() {
        return tiempoCompleto;
    }

    public void setTiempoCompleto(boolean tiempoCompleto) {
        this.tiempoCompleto = tiempoCompleto;
    }
    
    
}
