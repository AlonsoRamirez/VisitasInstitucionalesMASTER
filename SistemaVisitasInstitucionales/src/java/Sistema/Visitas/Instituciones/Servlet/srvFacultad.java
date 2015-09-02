/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.Visitas.Instituciones.Servlet;

import Sistema.Visitas.Institucionales.Core.Model.Facultad;
import Sistema.Visitas.Institucionales.Service.CatalogoServices;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Robert Bonilla
 */
public class srvFacultad extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("Hola Mundo");
        String Nombre=request.getParameter("txtNombre");
        String op=request.getParameter("operacion");        
        try
        {
            int idd = Integer.parseInt(request.getParameter("id"));
            if(idd>0)
            {
            if(op.equals("eliminar")){
                CatalogoServices controlador = new CatalogoServices();
                 if(controlador.DeleteFacultad(idd))
                 {
                     response.sendRedirect("/SistemaVisitasInstitucionales/Facultad.jsp");                      
                 }
                 else
                 {
                      out.println("error en la consulta");
                 }
         }
            if(op.equals("modificar")){
                   out.println(" "+Nombre+" id = "+idd);
              if(!Nombre.equals(""))
             {
                 CatalogoServices controlador = new CatalogoServices();
                 Facultad f = new Facultad();
                 f.setNombre(Nombre);
                 f.setId(idd);
                 if(controlador.UpdateFacultad(f))
                 {
                     //response.sendRedirect("/SistemaVisitasInstitucionales/Facultad.jsp");                      
                 }
                 else
                 {
                      out.println("error en la consulta");
                 }
             }
             else
             {
                out.println("Campo Vacio"); 
             }
         }
            }
        }
        catch(Exception e)
        {
            
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
       
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
       // out.println("Hola Mundo");
        String op=request.getParameter("operacion");
        String mod=request.getParameter("Mod");
        String Nombre=request.getParameter("txtNombre");       
        try{
         
            if(op.equals("agregar")){
             if(!Nombre.equals(""))
             {
                 CatalogoServices controlador = new CatalogoServices();
                 Facultad f = new Facultad();
                 f.setNombre(Nombre);
                 if(controlador.SaveFacultad(f))
                 {
                     response.sendRedirect("/SistemaVisitasInstitucionales/Facultad.jsp");                      
                 }
                 else
                 {
                      out.println("error en la consulta");
                 }
             }
             else
             {
                out.println("Campo Vacio"); 
             }
            }
           
           
        }
        catch(Exception ex) {out.println("Error");}
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}