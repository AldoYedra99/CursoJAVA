import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
    int id;
    String nombre;
    String email;

    public Usuario(int id, String nombre, String email){
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public static void obtenerUsuarios(){
        Scanner obj = new Scanner(System.in);
        ArrayList<Usuario> usuarios = new ArrayList<>();

        System.out.print("Ingrese cantidad de Usuarios: ");
        int cantidad = obj.nextInt();
        obj.nextLine();

        for (int i = 0; i < cantidad; i++){
        System.out.println("Usuario "+(i+1));

        System.out.print("ID:");
        int id = obj.nextInt();
        obj.nextLine();

        System.out.print("Nombre: ");
        String nombre = obj.nextLine();

        System.out.print("Email: ");
        String email = obj.nextLine();

        usuarios.add(new Usuario(id,nombre,email));
        }
        System.out.println("HTTP 200 OK");
        System.out.println("[");
        for(Usuario u : usuarios){
            System.out.println("{ \"id\": "+u.id+
        ", \"nombre\": \"" +u.nombre+
                    "\", \"email\": \"" +u.email+" \" },");
        }
        System.out.println("]");
    }
}
