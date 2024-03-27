<%-- 
    Document   : Editar
    Created on : 11 mar 2024, 15:29:17
    Author     : pc
--%>

<%@page import="logica.Usuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Usuario</title>
    </head>
    <body>
        <% Usuarios usu = (Usuarios) request.getSession().getAttribute("usuEditar");%>
        <h1>Datos del Usuario a Editar</h1>
        <form action="SvEditar" method="POST">
            <p><label>Dni:</label><input type= "text" name="dni" value="<%=usu.getDni()%>"></p>
            <p><label>Nombre:</label><input type="text" name="nombre" value="<%=usu.getNombre()%>"></p>
            <p><label>Apellido:</label><input type="text" name="apellido" value="<%=usu.getApellido()%>"></p>
            <p><label>Telefono:</label><input type="text" name="telefono" value="<%=usu.getTelefono()%>"></p>
            <button type="submit">Guardar</button>
        </form>
    </body>
</html>
