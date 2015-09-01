<%-- 
    Document   : Visitas
    Created on : 08-29-2015, 06:53:37 PM
    Author     : L.Michelle
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro de Visitas</title>
<body>
<center>
<h1>Registro de Visitas</h1>
 <html:form action="/visitas" method="post"> 
<table>
<tr>
<td>Asignado por: </td>
<td><html:select property="id_usuario"/></td>
</tr>
<tr>
<td>Institución: </td>
<td><html:select property="id_institucion"/></td>
</tr>
<td>Docente Asignado: </td>
<td><html:select property="id_usuarioAsigno"/></td>
</tr>
<tr>
<td>Fecha de Inicio: </td>
<td><html:text property="fechaInicio"/></td>
</tr>
<td>Fecha de finalización: </td>
<td><html:text property="fechaFin"/></td>
</tr>
<tr>
<td>Visita Realizada: </td>
<td> si <html:radio property="visitaRealizada" value="true"/></td>
<td> no <html:radio property="visitaRealizada" value="false"/></td>
</tr>
<td>Estado: </td>
<td><html:text property="estado"/></td>
</tr>
<tr>
<td>Comentarios: </td>
<td><html:text property="comentarios"/></td>
</tr>
<td>Comentarios sobre la visita: </td>
<td><html:text property="comentariosVisita"/></td>
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