package repository;
import model.Usuario;
import java.util.ArrayList;

public class UsuarioRepository {
    ArrayList<Usuario> usuarios = new ArrayList<>();

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public ArrayList<Usuario> listarUsuarios() {
        return usuarios;
    }

    public void eliminarUsuario(int id) {
        usuarios.removeIf(u -> u.id == id);
    }
}
