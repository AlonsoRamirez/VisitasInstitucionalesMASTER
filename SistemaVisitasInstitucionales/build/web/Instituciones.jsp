<%-- 
    Document   : Instituciones
    Created on : 08-19-2015, 11:39:18 AM
    Author     : L.Michelle
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name ="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="SistemaVisitasInstitucionales/Web/css/bootstrap.min.css">
        
        <title>Registro de Instituciones</title>
        
    </head>
    <body>
        <nav class=" navbar navbar-default" role="navigation">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-togle="collapse" data-target="#acolapsar">
                        <span class="sr-only">Toglenac dasdash</span> 
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>  
                    <a href="#" class="navbar-brand">Bienvenido Admin</a>                    
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
  <li><a href="Escuelas.jsp"><span class="glyphicon glyphicon-set"></span> Escuelas</a></li>
  <li><a href="Usuarios.jsp"><span class="glyphicon glyphicon-set"></span> Usuarios</a></li>
  <li><a href="Instituciones.jsp"><span class="glyphicon glyphicon-set"></span> Instituciones</a></li>
  <li><a href="Docentes.jsp"><span class="glyphicon glyphicon-set"></span> Docentes</a></li>
  <li><a href="Agenda.jsp"><span class="glyphicon glyphicon-set"></span> Agenda</a></li>
  <li><a href="Estudiantes.jsp"><span class="glyphicon glyphicon-set"></span> Estudiantes</a></li>
  <li><a href="Reportes.jsp"><span class="glyphicon glyphicon-set"></span> Reportes</a></li>
</ul>
                </div>
            </div>
                
        </nav>
           </nav>  
        <script src="https://code.jquery.com/jquery.js"></script>  
        <script src="SistemaVisitasInstitucionales/Web/js/min.js"></script>  
        <html:form action="/institucion" method="post"> 
<table>
<tr>
<td>Nombre de la Institución: </td>
<td><html:select property="nombre"/></td>
</tr>
<tr>
<td>Dirección: </td>
<td><html:text property="direccion"/></td>
</tr>
<td>Primer Contacto: </td>
<td><html:text property="contacto1"/></td>
</tr>
<tr>
<td>Teléfono: </td>
<td><html:text property="telefono1"/></td>
</tr>
<td>Segundo Contacto: </td>
<td><html:text property="contacto2"/></td>
</tr>
<tr>
<td>Teléfono: </td>
<td><html:text property="telefono2"/></td>
</tr>
<tr>
<td colspan="2">
<br/>
<html:submit property="submit" value="Validar"/>
<html:reset value="Limpiar"/>
</td>
</tr>
</table>
</html:form>
<br/>
</center>
</body>
</html:html>

