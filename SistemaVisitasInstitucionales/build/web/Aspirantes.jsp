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
<title>Registro de Aspirantes</title>
<body>
<center>
<h1>Registro de Aspirantes</h1>
 <html:form action="/aspirante" method="post"> 
<table>
<tr>
<td>Nombres: </td>
<td><html:text property="nombre"/></td>
</tr>
<tr>
<td>Apellidos: </td>
<td><html:text property="apellido"/></td>
</tr>
<td>Teléfono: </td>
<td><html:text property="telefono"/></td>
</tr>
<tr>
<td>Correo Electronico: </td>
<td><html:text property="correo"/></td>
</tr>
<td>Fecha de Ingreso: </td>
<td><html:text property="fechaIngreso"/></td>
</tr>
<tr>
<td>Primera Opción: </td>
<td><html:text property="id_carrera1"/></td>
</tr>
<td>Segunda Opción: </td>
<td><html:text property="id_carrera2"/></td>
</tr>
<tr>
<td>Institución: </td>
<td><html:text property="id_institucion"/></td>
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