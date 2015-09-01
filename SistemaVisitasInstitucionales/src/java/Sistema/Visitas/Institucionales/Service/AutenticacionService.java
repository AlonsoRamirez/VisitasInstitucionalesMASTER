/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.Visitas.Institucionales.Service;

import Sistema.Visitas.Institucionales.Core.Model.Autenticacion;
import Sistema.Visitas.Institucionales.Data.AutenticacionRepository;

/**
 *
 * @author L.Michelle
 */
public class AutenticacionService {
 
    AutenticacionRepository _autenticacion;
    public AutenticacionService(){
    
    _autenticacion = new AutenticacionRepository();
    
    }
    
  
    public boolean autenticacion(Autenticacion aut) {
        
        return _autenticacion.Validar(aut);
    }
    
      
}


