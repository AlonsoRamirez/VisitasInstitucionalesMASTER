package Sistema.Visitas.Institucionales.Controllers;


import Sistema.Visitas.Institucionales.Core.Model.Autenticacion;

import Sistema.Visitas.Institucionales.Service.AutenticacionService;
import javax.servlet.http.*;
import org.apache.struts.action.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP-PC
 */
public class SessionController extends Action {
    
    @Override
    public ActionForward execute(ActionMapping mapping,
            ActionForm form,HttpServletRequest request,
            HttpServletResponse response)throws Exception
    {
        AutenticacionService aut = new AutenticacionService();
        Autenticacion datos = (Autenticacion) form;
        if(aut.autenticacion(datos)){
            return mapping.findForward("index");
        }else{
            return mapping.findForward("error");
        }
    }
  
    
}
