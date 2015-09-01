
package Sistema.Visitas.Institucionales.Data;
import Sistema.Visitas.Institucionales.Core.Model.Aspirante;
import Sistema.Visitas.Institucionales.Data.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

public class AspirantesRepository {
    private Connection cn;
    private String sql;
     public AspirantesRepository(){
         this.cn = new Conexion().getCon();
    }

    public Connection getCn() {
        return cn;
    }
   
    /*------------------------------------------------Aspirante--------------------------------------------------*/
      public boolean guardarAspirante(Aspirante aspirante)
    {
        boolean resp = false;
        try 
        {
            sql = "INSERT INTO aspirantes (nombre,apellido,correo,fechaIngreso,carrera1,carrera2,institucion,telefono)";
            sql += " Values(?,?,?,?,  ?,?,?,?)";
            PreparedStatement cmd = this.cn.prepareStatement(sql);
            cmd.setString(1, aspirante.getNombre());
            cmd.setString(2, aspirante.getApellido());
            cmd.setString(3, aspirante.getCorreo());
            cmd.setString(4, aspirante.getFechaIngreso());
            cmd.setInt(5,aspirante.getId_carrera1());
            cmd.setInt(6,aspirante.getId_carrera2());
            cmd.setInt(7,aspirante.getId_institucion());
            cmd.setString(8, aspirante.getTelefono());
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
    public boolean modificarAspirante(Aspirante aspirante)
    {
        boolean resp = false;
        try 
        {
            sql = "update aspirantes set nombre = ?,apellido=?,correo=?,fechaIngreso=?,carrera1=?,carrera2=?,institucion=?,telefono=? ";
            sql += " where id = ?";
            PreparedStatement cmd = this.cn.prepareStatement(sql);
            cmd.setString(1, aspirante.getNombre());
            cmd.setString(2, aspirante.getApellido());
            cmd.setString(3, aspirante.getCorreo());
            cmd.setString(4, aspirante.getFechaIngreso());
            cmd.setInt(5,aspirante.getId_carrera1());
            cmd.setInt(6,aspirante.getId_carrera2());
            cmd.setInt(7,aspirante.getId_institucion());
            cmd.setString(8, aspirante.getTelefono());
            cmd.setInt(9,aspirante.getId());
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
    
    public List<Aspirante> cosultarAspirantes(){
        List<Aspirante> listAspirante = new ArrayList<>();
        try{
            Statement cmd = this.cn.createStatement();
            ResultSet rs =cmd.executeQuery("Select a.id,a.nombre,a.apellido,a.telefono,a.correo,a.fechaIngreso,a.carrera1,a.carrera2,a.institucion  from aspirantes a ");
            InstitucionesRepository instCont = new InstitucionesRepository();
            EscuelasRepository escCont = new EscuelasRepository();
            while(rs.next()){
             listAspirante.add(new Aspirante(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getInt(8),rs.getInt(9),instCont.cosultarInstitucion(rs.getInt(1)),escCont.cosultarEscuela(rs.getInt(7)),escCont.cosultarEscuela(rs.getInt(8))));
            }
            if(!this.cn.isClosed())
            {
                this.cn.close();
            }            
        }
        catch(Exception e){
        System.err.println("Error" + e.getMessage());
        }
        return listAspirante;
        }
    
        public Aspirante cosultarAspirante(int id){
        List<Aspirante> listAspirante = new ArrayList<>();
        try{
            Statement cmd = this.cn.createStatement();
            ResultSet rs =cmd.executeQuery("Select a.id,a.nombre,a.apellido,a.correo,a.fechaIngreso,a.carrera1,a.carrera2,a.institucion  from aspirantes a  where a.id = "+id);
           InstitucionesRepository instCont = new InstitucionesRepository();
            EscuelasRepository escCont = new EscuelasRepository();
            while(rs.next()){
             listAspirante.add(new Aspirante(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getInt(8),rs.getInt(9),instCont.cosultarInstitucion(rs.getInt(1)),escCont.cosultarEscuela(rs.getInt(7)),escCont.cosultarEscuela(rs.getInt(8))));
            }
            if(!this.cn.isClosed())
            {
                this.cn.close();
            }            
        }
        catch(Exception e){
        System.err.println("Error" + e.getMessage());
        }
        return listAspirante.get(1);
        }
   
     public boolean eliminarAspirante(int id)
    {
        boolean resp = false;
        try 
        {
            sql = "Delete From aspirantes  where id = "+id;
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
