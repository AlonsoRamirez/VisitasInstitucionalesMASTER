/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.Visitas.Institucionales.Service;

import Sistema.Visitas.Institucionales.Data.AspirantesRepository;
import Sistema.Visitas.Institucionales.Core.Model.Aspirante;
import java.util.List;

/**
 *
 * @author HP-PC
 */
abstract class AspirantesService{

    AspirantesRepository _aspirantes;
    
    public AspirantesService()
    {
        _aspirantes = new AspirantesRepository();
    }
   
    public Aspirante GetAspirante(int id) {
     return _aspirantes.cosultarAspirante(id);
    }

    
    public List<Aspirante> GetAspirantes(int id, String nombre) {
        return _aspirantes.cosultarAspirantes();
    }

   
    public boolean SaveAspirante(Aspirante aspirante) {
        return _aspirantes.guardarAspirante(aspirante);
    }
    
    public boolean UpdateAspirante(Aspirante aspirante) {
        return _aspirantes.modificarAspirante(aspirante);
    }

    
    public boolean DeleteAspirante(int id) {
        return _aspirantes.eliminarAspirante(id);
    }
    
}
