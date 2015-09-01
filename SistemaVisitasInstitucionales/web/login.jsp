<%-- 
    Document   : login
    Created on : 08-18-2015, 06:24:54 PM
    Author     : L.Michelle
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name ="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="SistemaVisitasInstitucionales/Web/css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="SistemaVisitasInstitucionales/Web/css/login.css">
        <title>~~~Welcome~~~</title>
		<style type="text/css">
             
                 body {
			background-image: url("fondoudb.jpg");
             } 
		</style>
    </head>
    <body>
    <div class="jumbotron loginbox">
    <h4>Sistema de Visitas Institucionales UDB</h4> 
    <html:form action="/login" method="post"> 
              <label>  Usuario: </label>
              <td><html:text property="usuario"/></td><br>
              <label>  Password: </label> 
              <td><html:password property="password"/></td>
              <html:submit property="submit" value="Validar"/>
              <img src="udb.png" height="150" width="150" hspace="90">
                 
    </html:form>	
    </div>  
	 <body>
                				
</html:html>

