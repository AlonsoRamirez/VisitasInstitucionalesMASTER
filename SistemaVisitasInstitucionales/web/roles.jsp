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
<title>Rol</title>
<body>
<center>
<h1>Roles</h1>
 <html:form action="/rol" method="post"> 
<table>
<tr>
<td>Rol: </td>
<td><html:text property="nombre"/></td>
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