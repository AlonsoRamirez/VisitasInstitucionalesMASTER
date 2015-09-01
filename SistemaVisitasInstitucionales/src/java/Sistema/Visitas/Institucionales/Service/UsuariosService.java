/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.Visitas.Institucionales.Service;

import Sistema.Visitas.Institucionales.Core.Model.Usuario;
import Sistema.Visitas.Institucionales.Data.UsuariosRepository;
import java.util.List;

/**
 *
 * @author HP-PC
 */
abstract class UsuariosService{

    UsuariosRepository _usuarios;
    public UsuariosService() {
        _usuarios = new UsuariosRepository();
    }

    
    
    public Usuario GetUsuario(int id) {
        return _usuarios.cosultarUsuario(id);
    }

   
    public List<Usuario> GetUsuarios(int id, String nombre) {
         return _usuarios.cosultarUsuarios();
    }

    
    public boolean SaveUsuario(Usuario user) {
         return _usuarios.guardarUsuario(user);
    }
     public boolean UpdateUsuario(Usuario user) {
         return _usuarios.modificarUsuario(user);
    }

    
    public boolean DeleteUsuario(int id) {
       return _usuarios.eliminarUsuario(id);
    }

    
}
