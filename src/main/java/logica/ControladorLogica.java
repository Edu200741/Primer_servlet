
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;


public class ControladorLogica {
    ControladoraPersistencia conPersi = new ControladoraPersistencia();

    public void crearUsuarios(Usuarios usu){
        conPersi.crearUsuarios(usu);
    }
    
    public List<Usuarios> traerUsuarios(){
        return conPersi.traerUsuarios();
    }

    public void borrarUsuario(int id_eliminar) {

        conPersi.borrarUsuario(id_eliminar);


    }

   

    public Usuarios traerUsuario(int id_editar) {

        return conPersi.traerUsuario(id_editar);

    }

    public void editarUsuarios(Usuarios usu) {
 
    conPersi.editarUsuario(usu);
    
    }




}




