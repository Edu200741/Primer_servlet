/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Usuarios;
import persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {
    UsuariosJpaController JpaUsuarios = new UsuariosJpaController();

    
    //operacion CREATE
    public void crearUsuarios(Usuarios usu){
        JpaUsuarios.create(usu);
    }
    //operacion READ
    public List<Usuarios> traerUsuarios(){
        return JpaUsuarios.findUsuariosEntities();
    }

    public void borrarUsuario(int id_eliminar) {
        
        try {
            JpaUsuarios.destroy(id_eliminar);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Usuarios traerUsuario(int id_editar) {

    return JpaUsuarios.findUsuarios(id_editar);
    
    }

    public void editarUsuario(Usuarios usu) {
 
        try {
            JpaUsuarios.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }














}








