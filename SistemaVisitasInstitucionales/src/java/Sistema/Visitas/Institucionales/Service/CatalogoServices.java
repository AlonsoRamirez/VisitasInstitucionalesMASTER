/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.Visitas.Institucionales.Service;


import Sistema.Visitas.Institucionales.Core.Model.Escuela;
import Sistema.Visitas.Institucionales.Core.Model.Facultad;
import Sistema.Visitas.Institucionales.Core.Model.Institucion;
import Sistema.Visitas.Institucionales.Core.Model.Rol;
import Sistema.Visitas.Institucionales.Data.EscuelasRepository;
import Sistema.Visitas.Institucionales.Data.FacultadRepository;
import Sistema.Visitas.Institucionales.Data.InstitucionesRepository;
import Sistema.Visitas.Institucionales.Data.RolesRepository;
import java.util.List;

/**
 *
 * @author L.Michelle
 */
abstract class CatalogoServices {


    public Escuela GetEscuela(int id) {
        EscuelasRepository EscuelaRep = new EscuelasRepository();        
        return EscuelaRep.cosultarEscuela(id);
   }

    public List<Escuela> GetEscuelas() {
         EscuelasRepository EscuelaRep = new EscuelasRepository();        
        return EscuelaRep.cosultarEscuelas();}

    public boolean DeleteEscuela(int id) {
         EscuelasRepository EscuelaRep = new EscuelasRepository();        
        return EscuelaRep.eliminarEscuela(id); }

    
    public Escuela SaveEscuela(Escuela escuela) {
         EscuelasRepository EscuelaRep = new EscuelasRepository();        
        EscuelaRep.guardarEscuela(escuela);
        return escuela;
    }
     public Escuela UpdateEscuela(Escuela escuela) {
         EscuelasRepository EscuelaRep = new EscuelasRepository();        
        EscuelaRep.modificarEscuela(escuela);
        return escuela;
    }

   
    public Institucion GetInstitucion(int id) {
         InstitucionesRepository InsRep = new InstitucionesRepository();
        return InsRep.cosultarInstitucion(id);
    }

    
    public List<Institucion> GetInstituciones(int id, String nombre) {
         InstitucionesRepository InsRep = new InstitucionesRepository();
        return InsRep.cosultarInstituciones(); }

 
    public boolean DeleteInstitucion(int id) {
         InstitucionesRepository InsRep = new InstitucionesRepository();
        return InsRep.eliminarInstitucion(id); }

   
    public boolean SaveInstitucion(Institucion institucion) {
         InstitucionesRepository InsRep = new InstitucionesRepository();
      return  InsRep.guardarInstitucion(institucion);
    }
    
     public boolean UpdateInstitucion(Institucion institucion) {
         InstitucionesRepository InsRep = new InstitucionesRepository();
      return  InsRep.modificarInstitucion(institucion);
    }
    
   
    public Facultad GetFacultad(int id) {
        FacultadRepository facRep = new FacultadRepository();
        return facRep.cosultarFacultad(id);
    }

    public List<Facultad> GetFacultades(int id, String nombre) {
     FacultadRepository facRep = new FacultadRepository();
        return facRep.cosultarFacultades();
    }

   
    public boolean DeleteFacultad(int id) {
    FacultadRepository facRep = new FacultadRepository();
        return facRep.eliminarFacultad(id);
    }

    
    public boolean SaveFacultad(Facultad facultad) {
    FacultadRepository facRep = new FacultadRepository();
        return facRep.guardarFacultad(facultad);
    }

    public boolean UpdateFacultad(Facultad facultad) {
    FacultadRepository facRep = new FacultadRepository();
        return facRep.modificarFacultad(facultad);
    }

    public Rol GetRol(int id) {
        RolesRepository rolRep = new RolesRepository();
       return rolRep.cosultarRol(id);
    }

  
    public List<Rol> GetRoles(int id, String nombre) {
       RolesRepository rolRep = new RolesRepository();
       return rolRep.cosultarRoles();
    }

 
    public boolean DeleteRol(int id) {
        RolesRepository rolRep = new RolesRepository();
       return rolRep.eliminarRol(id);
    }

    
    public boolean SaveRol(Rol rol) {
       RolesRepository rolRep = new RolesRepository();
       return rolRep.guardarRol(rol);
    }
     public boolean UpdateRol(Rol rol) {
       RolesRepository rolRep = new RolesRepository();
       return rolRep.modificarRol(rol);
    }
}
