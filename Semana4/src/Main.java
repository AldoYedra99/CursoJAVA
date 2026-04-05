public class Main {
    public static void main(String[] args) {

        UsuarioService service = new UsuarioService();

        try {
            Usuario u = service.buscarUsuario(1);
            System.out.println(u.nombre);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
