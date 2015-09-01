/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.Visitas.Institucionales.Service;

import Sistema.Visitas.Institucionales.Core.Model.Visitas;
import Sistema.Visitas.Institucionales.Data.VisitasRepository;
import java.util.List;

/**
 *
 * @author HP-PC
 */
abstract class VisitasService {

    VisitasRepository _visitas;
    public VisitasService()
    {
        _visitas = new VisitasRepository();
    }
    public Visitas GetVisita(String usuario) {
        return _visitas.cosultarVisita(usuario);
    }

    public List<Visitas> GetVisitas(int id) {
      return _visitas.cosultarVisitas();
        }

 
    public boolean SaveVisita(Visitas visita) {
            return _visitas.guardarVisita(visita);
    }
    
    public boolean UpdateVisita(Visitas visita) {
            return _visitas.modificarVisita(visita);
    }

  
    
    public boolean DeleteVisita(Visitas visita) {
        return _visitas.eliminarVisita(visita);
    }
    
}
