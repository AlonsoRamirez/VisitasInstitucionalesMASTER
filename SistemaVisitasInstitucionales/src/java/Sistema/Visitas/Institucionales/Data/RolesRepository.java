package Sistema.Visitas.Institucionales.Data;
import Sistema.Visitas.Institucionales.Data.Conexion;
import Sistema.Visitas.Institucionales.Core.Model.Rol;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

public class RolesRepository {
    private Connection cn;
    private String sql;
     public RolesRepository(){
         this.cn = new Conexion().getCon();
    }

    public Connection getCn() {
        return cn;
    }
    /*------------------------------------------------Rol--------------------------------------------------*/
     public boolean guardarRol(Rol rol)
    {
        boolean resp = false;
        try 
        {
            sql = "INSERT INTO roles (nombre) Values(?)";
            PreparedStatement cmd = this.cn.prepareStatement(sql);
            cmd.setString(1, rol.getNombre());
            cmd.executeUpdate();
            if(!this.cn.isClosed())
            {
                this.cn.close();
            }
            resp = true;
        } 
        catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return resp;
    }
     
     
     public boolean modificarRol(Rol rol)
    {
        boolean resp = false;
        try 
        {
            sql = "update roles set nombre = ? where id = ?";
            PreparedStatement cmd = this.cn.prepareStatement(sql);
            cmd.setString(1, rol.getNombre());
            cmd.setInt(2, rol.getId());
            cmd.executeUpdate();
            if(!this.cn.isClosed())
            {
                this.cn.close();
            }
            resp = true;
        } 
        catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return resp;
    }
    public List<Rol> cosultarRoles(){
        List<Rol> listRol = new ArrayList<>();
        try{
            Statement cmd = this.cn.createStatement();
            ResultSet rs =cmd.executeQuery("SELECT r.id,r.nombre from roles r");
            while(rs.next()){
               listRol.add(new Rol(rs.getInt(1),rs.getString(2)));
            }
            if(!this.cn.isClosed())
            {
                this.cn.close();
            }
        }
        catch(Exception e){
        System.err.println("Error" + e.getMessage());
        }
        return listRol;
        }
     public Rol cosultarRol(int id){
        List<Rol> listRol = new ArrayList<>();
        try{
            Statement cmd = this.cn.createStatement();
            ResultSet rs =cmd.executeQuery("SELECT r.id,r.nombre from roles r where r.id ="+id);
            while(rs.next()){
               listRol.add(new Rol(rs.getInt(1),rs.getString(2)));
            }
            if(!this.cn.isClosed())
            {
                this.cn.close();
            }
        }
        catch(Exception e){
        System.err.println("Error" + e.getMessage());
        }
        return listRol.get(1);
        }
     
    public boolean eliminarRol(int id)
    {
        boolean resp = false;
        try 
        {
            sql = "Delete From roles  where id = "+id;
            PreparedStatement cmd = this.cn.prepareStatement(sql);
            cmd.executeUpdate();
            if(!this.cn.isClosed())
            {
                this.cn.close();
            }
            resp = true;
        } 
        catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return resp;
    }
}
