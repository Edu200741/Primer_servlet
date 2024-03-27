<%-- 
    Document   : mostrarUsuarios
    Created on : 5 mar 2024, 12:50:43
    Author     : pc
--%>

<%@page import="java.util.List"%>
<%@page import="logica.Usuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Usuarios</title>
    </head>
    <body>
        <h1>Lista de Usuarios Registrados</h1>

        <% List<Usuarios> listaUsuarios = (List) request.getSession().getAttribute("listaDeUsuarios");
            int cont = 1;
            for (Usuarios usu : listaUsuarios) {
        %>

        <%--HTML--%>
        <p><b> Usuario n:<%=cont%></B></p>
        <p>ID :<%=usu.getId()%></p>
        <p>Dni :<%=usu.getDni()%></p>
        <p>Nombre :<%=usu.getNombre()%></p>
        <p>Apellido :<%=usu.getApellido()%></p>
        <p>Telefono :<%=usu.getTelefono()%></p>
        <p>--------------------------------</p>
        <% cont= cont +1; %>
        
        <%}%>  



    </body>
</html>
