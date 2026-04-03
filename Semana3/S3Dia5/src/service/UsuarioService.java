package service;
import model.Usuario;
import repository.UsuarioRepository;

import java.util.ArrayList;

public class UsuarioService {

    UsuarioRepository repo = new UsuarioRepository();

    public void crearUsuario(int id,String nombre,String email) {
        Usuario usuario = new Usuario(id, nombre, email);
        repo.agregarUsuario(usuario);
    }

    public ArrayList<Usuario> listarUsuarios(){
        return repo.listarUsuarios();
    }

    public void eliminarUsuario(int id){
        repo.eliminarUsuario(id);
    }
}
