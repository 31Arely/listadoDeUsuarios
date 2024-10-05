<%-- 
    Document   : listadoUsuario
    Created on : 4 oct. 2024, 22:25:21
    Author     : Arely
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LISTADO DE USUARIOS</title>
    </head>
    <body>
        <h1>Listado de usuarios</h1>
        <ul>
            <c:forEach items="${usuarios}" var="usuario">
                <li>${usuario.nombre} ${usuario.apellido} ${usuario.tipoDeMembresia}</li>
            </c:forEach>
        </ul>
    </body>
</html>
