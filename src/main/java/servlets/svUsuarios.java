
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.ControladorLogica;
import logica.Usuarios;


@WebServlet(name = "svUsuarios", urlPatterns = {"/svUsuarios"})
public class svUsuarios extends HttpServlet {

    ControladorLogica conLogica = new ControladorLogica();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Usuarios> listaUsuarios = new ArrayList<>();
        
        listaUsuarios = conLogica.traerUsuarios();
        
        
        HttpSession miSesion = request.getSession();
        miSesion.setAttribute("listaDeUsuarios", listaUsuarios);
        
        response.sendRedirect("mostrarUsuarios.jsp");
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido= request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
      
        Usuarios usu = new Usuarios();
        
        usu.setApellido(apellido);
        usu.setDni(dni);
        usu.setNombre(nombre);
        usu.setTelefono(telefono);
        
        conLogica.crearUsuarios(usu);
        response.sendRedirect("index.jsp");
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
