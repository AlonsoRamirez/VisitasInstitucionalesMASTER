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
public class Escuela {
    int id;
    int id_facultad;
    String nombre;
    Facultad listFacultad;
    public Escuela() {
        
    }

    public Escuela(int id,  String nombre,int id_facultad) {
        this.id = id;
        this.id_facultad = id_facultad;
        this.nombre = nombre;
    }
     public Escuela(int id,  String nombre,int id_facultad,Facultad listFacultad) {
        this.id = id;
        this.id_facultad = id_facultad;
        this.nombre = nombre;
        this.listFacultad = listFacultad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_facultad() {
        return id_facultad;
    }

    public void setId_facultad(int id_facultad) {
        this.id_facultad = id_facultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Facultad getListFacultad() {
        return listFacultad;
    }

    public void setListFacultad(Facultad listFacultad) {
        this.listFacultad = listFacultad;
    }

  
    
    
}
