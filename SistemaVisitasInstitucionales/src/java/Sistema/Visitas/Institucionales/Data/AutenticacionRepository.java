/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.Visitas.Institucionales.Data;

import Sistema.Visitas.Institucionales.Core.Model.Autenticacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author HP-PC
 */
public class AutenticacionRepository {
    private Connection cn;
    private String sql;
    
     public AutenticacionRepository(){
         this.cn = new Conexion().getCon();
    }

    public Connection getCn() {
        return cn;
    }
    
    public boolean Validar(Autenticacion aut){
    
        boolean estado = false;
    try{
            Statement cmd = this.cn.createStatement();
            ResultSet rs =cmd.executeQuery("SELECT * FROM usuarios WHERE contrasena ='"+ aut.getPassword()+"' AND usuario ='"+aut.getUsuario()+"'");
                 

            estado = rs.next();
            if(!this.cn.isClosed())
            {
                this.cn.close();
            }
        }
        catch(Exception e){
        System.err.println("Error" + e.getMessage());
        }
    
    return estado;
    }
    
    
}
