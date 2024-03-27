package servlets;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.ControladorLogica;
import logica.Usuarios;

@WebServlet(name = "SvEditar", urlPatterns = {"/SvEditar"})
public class SvEditar extends HttpServlet {
    ControladorLogica conLogica = new ControladorLogica();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id_editar = Integer.parseInt(request.getParameter("id_editar"));
        
        Usuarios usu = conLogica.traerUsuario(id_editar);
        
        HttpSession miSecion = request.getSession();
        miSecion.setAttribute("usuEditar", usu);
        
        response.sendRedirect("Editar.jsp");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido= request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
      
        Usuarios usu = (Usuarios) request.getSession().getAttribute("usuEditar");
        
        
        usu.setDni(dni);
        usu.setNombre(nombre);
        usu.setTelefono(telefono);
        usu.setApellido(apellido);
        
        conLogica.editarUsuarios(usu);
        
        response.sendRedirect("index.jsp");
        
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
