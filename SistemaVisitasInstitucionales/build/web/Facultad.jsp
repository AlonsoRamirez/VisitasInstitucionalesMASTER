<%-- 
    Document   : Visitas
    Created on : 08-29-2015, 06:53:37 PM
    Author     : L.Michelle
--%>

<%@page import="Sistema.Visitas.Institucionales.Core.Model.Facultad"%>
<%@page import="Sistema.Visitas.Institucionales.Service.CatalogoServices"%>
<%@page import="java.util.List"%>
<%@page import="Sistema.Visitas.Institucionales.Controllers.FacultadController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro de Facultades</title>
<body>
    <script>
    function String copiar(){
     var a = document.getElementById("txtNombre").value; 
     return a;
}
</script>
<center>
<h1>Registro de Facultades</h1>
   <form id="form" method="post" action = "/SistemaVisitasInstitucionales/srvFacultad">
                    <br><br>
                    <b>Facultades:</b><br/><br/>

              <br/><br/>
                    <br/>
                    Nombre: <input name="txtNombre" id="txtNombre" type=text"/><br/>
                    <hr><br/>
                    <input type="submit" name="operacion" value="agregar">
                    <input type="reset" value="Actualizar">
                  
                <div class="table-responsive">
                <table class="table table-hover">
                    <tr>
                        <td>Nombre</td>
                        <td></td>
                        <td></td>
                    </tr>
                       <%
            CatalogoServices controlador = new CatalogoServices();            
                   List lista= controlador.GetFacultades(1, "d");
                   if(lista != null){                       
                        for(int i=0;i<lista.size();i++){
                            Facultad f=(Facultad)lista.get(i);
                            if(lista.size()!=0){   
                                out.println("<tr>");
                                 out.println("<td>"+f.getNombre()+"</td>");
                        out.println("<td><a href=\"/SistemaVisitasInstitucionales/srvFacultad?operacion=eliminar&id="+f.getId()+"\">Eliminar</a></td>");
                        out.println("<td><a href=\"/SistemaVisitasInstitucionales/srvFacultad?operacion=modificar&id="+f.getId()+"&txtNombre=\"copiar();\"\">Modificar</a></td>");
                        out.println("</tr>");
                            }
                        }
                   }                   
                %>
                    
                </table>
                </div>
                </form>
<br/>
</center>
</body>
</html>