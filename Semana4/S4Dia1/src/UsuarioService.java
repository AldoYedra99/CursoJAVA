import java.util.ArrayList;
import java.util.List;

public class UsuarioService {
    private List<Usuario> usuarios = new ArrayList<>();

    public UsuarioService(){
        usuarios.add(new Usuario(1,"Aldo"));
    }
    public Usuario buscarUsuario(int id) {

        for (Usuario u : usuarios){
            if (u.id == id) {
                return u;
            }
        }
        throw new RuntimeException("Usuario no encontrado");
    }
}
