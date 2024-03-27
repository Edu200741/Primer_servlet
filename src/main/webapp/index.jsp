<%-- 
    Document   : index
    Created on : 27 feb 2024, 14:38:41
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>formulario de prueba</title>
    </head>
    <body>
        <h1>Datos del Usuario</h1>
        <form action="svUsuarios" method="POST">
            <p><label>Dni:</label><input type= "text" name="dni"></p>
            <p><label>Nombre:</label><input type="text" name="nombre"></p>
            <p><label>Apellido:</label><input type="text" name="apellido"></p>
            <p><label>Telefono:</label><input type="text" name="telefono"></p>
            <button type="submit">Enviar</button>
        </form>

        <h1>ver Lista de Usuarios</h1>
        <p>para ver la Lista de usuarios haga click en el boton</p>
        <form action="svUsuarios" method="GET">
            <button type="submit"> Mostrar Usuarios</button>
        </form>
        
        <h1>eliminar usuario</h1>
        <p>ingrese la id del usuario que quiere eliminar</p>
        <form action="SvEliminar" method="POST">
            <p><label>Id:</label><input type= "text" name="id"></p>
            <button type="submit">eliminar usuario</button>
        </form>
        
         <h1>editar usuario</h1>
        <p>ingrese la id del usuario que quiere editar</p>
        <form action="SvEditar" method="GET">
            <p><label>Id:</label><input type= "text" name="id_editar"></p>
            <button type="submit">editar usuario</button>
        </form>



    </body>
</html>
