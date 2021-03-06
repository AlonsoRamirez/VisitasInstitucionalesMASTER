package Sistema.Visitas.Institucionales.Data;
import Sistema.Visitas.Institucionales.Data.Conexion;
import Sistema.Visitas.Institucionales.Core.Model.Institucion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

public class InstitucionesRepository {
    private Connection cn;
    private String sql;
    
     public InstitucionesRepository(){
         this.cn = new Conexion().getCon();
    }

    public Connection getCn() {
        return cn;
    }
    /*------------------------------------------------Instituciones--------------------------------------------------*/
     public boolean guardarInstitucion(Institucion institucion)
    {
        boolean resp = false;
        try 
        {
            sql = "INSERT INTO instituciones (nombre,direccion,contacto1,telefono1,contacto2,telefono2)";
            sql += " Values(?,?,?,  ?,?,?)";
            PreparedStatement cmd = this.cn.prepareStatement(sql);
            cmd.setString(1, institucion.getNombre());
            cmd.setString(2, institucion.getDireccion());
            cmd.setString(3, institucion.getContacto1());
            
            cmd.setString(4, institucion.getTelefono1());
            cmd.setString(5, institucion.getContacto2());
            cmd.setString(6, institucion.getTelefono2());
            
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
      public boolean modificarInstitucion(Institucion institucion)
    {
        boolean resp = false;
        try 
        {
            sql = "update instituciones set nombre=?,direccion=?,contacto1=?,telefono1=?,contacto2=?,telefono2=?";
            sql += " where id = ?";
            PreparedStatement cmd = this.cn.prepareStatement(sql);
            cmd.setString(1, institucion.getNombre());
            cmd.setString(2, institucion.getDireccion());
            cmd.setString(3, institucion.getContacto1());
            
            cmd.setString(4, institucion.getTelefono1());
            cmd.setString(5, institucion.getContacto2());
            cmd.setString(6, institucion.getTelefono2());
            
            cmd.setInt(7, institucion.getId());
            
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
    public Institucion cosultarInstitucion(int id){
        List<Institucion> listInstitucion = new ArrayList<>();
        try{
            Statement cmd = this.cn.createStatement();
            ResultSet rs =cmd.executeQuery("Select i.id,i.nombre,i.contacto1,i.telefono1,i.contacto2,i.telefono2 from instituciones i where i.id = "+id);
            while(rs.next()){
               listInstitucion.add(new Institucion(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)));
            }
            if(!this.cn.isClosed())
            {
                this.cn.close();
            }
        }
        catch(Exception e){
        System.err.println("Error" + e.getMessage());
        }
        return listInstitucion.get(1);
        }
      public List<Institucion> cosultarInstituciones(){
        List<Institucion> listInstitucion = new ArrayList<>();
        try{
            Statement cmd = this.cn.createStatement();
            ResultSet rs =cmd.executeQuery("Select i.id,i.nombre,i.contacto1,i.telefono1,i.contacto2,i.telefono2 from instituciones i");
            while(rs.next()){
               listInstitucion.add(new Institucion(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)));
            }
            if(!this.cn.isClosed())
            {
                this.cn.close();
            }
        }
        catch(Exception e){
        System.err.println("Error" + e.getMessage());
        }
        return listInstitucion;
        }
     public boolean eliminarInstitucion(int id)
    {
        boolean resp = false;
        try 
        {
            sql = "Delete From instituciones  where id =  "+id;
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
