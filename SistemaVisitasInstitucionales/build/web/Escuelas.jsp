<%-- 
    Document   : Visitas
    Created on : 08-29-2015, 06:53:37 PM
    Author     : L.Michelle
--%>

<%@page import="Sistema.Visitas.Institucionales.Core.Model.Escuela"%>
<%@page import="java.util.List"%>
<%@page import="Sistema.Visitas.Institucionales.Service.CatalogoServices"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro de Escuelas</title>
<body>
<center>
<h1>Registro de Escuelas</h1>
 <form id="form" method="post" action = "/SistemaVisitasInstitucionales/srvEscuelas"> 
<table>
<tr>
<td>Nombre: </td>
<td><input type="text" name="txtNombre"/></td>
</tr>
<tr>
<td>Institución: </td>
<td><input type="number" name="id_facultad"/></td>
</tr>
<tr>
<td colspan="2">
<br/>
<input type="submit" name="operacion" value="agregar">
                    <input type="reset" value="Actualizar">
<div class="table-responsive">
                <table class="table table-hover">
                    <tr>
                        <td>Nombre</td>
                        <td></td>
                        <td></td>
                         <td></td>
                    </tr>
                       <%
            CatalogoServices controlador = new CatalogoServices();            
                   List lista= controlador.GetEscuelas();
                   if(lista != null){                       
                        for(int i=0;i<lista.size();i++){
                            Escuela f=(Escuela)lista.get(i);
                            if(lista.size()!=0){   
                                out.println("<tr>");
                                 out.println("<td>"+f.getNombre()+"</td>");
                                 out.println("<td>"+f.getListFacultad().getNombre()+"</td>");
                        out.println("<td><a href=\"/SistemaVisitasInstitucionales/srvFacultad?operacion=eliminar&id="+f.getId()+"\">Eliminar</a></td>");
                        out.println("<td><a href=\"/SistemaVisitasInstitucionales/srvFacultad?operacion=modificar&id="+f.getId()+"&txtNombre=\"copiar();\"\">Modificar</a></td>");
                        out.println("</tr>");
                            }
                        }
                   }                   
                %>
                    
                </table>
                </div>
</td>
</tr>
</table>
</form>
<br/>
</center>
</body>
</html>