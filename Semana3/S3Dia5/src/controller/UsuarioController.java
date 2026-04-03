package controller;
import service.UsuarioService;
import java.util.Scanner;

public class UsuarioController {

    UsuarioService service = new UsuarioService();
    Scanner obj= new Scanner(System.in);


    public void menu() {
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Crear usuario");
            System.out.println("2. Listar usuarios");
            System.out.println("3. Eliminar usuario");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            opcion = obj.nextInt();
            obj.nextLine();

            switch (opcion) {
                case 1:
                    crearUsuario();
                    break;
                case 2:
                    listarUsuarios();
                    break;
                case 3:
                    eliminarUsuario();
                    break;
                case 0:
                    System.out.println("Adiós 👋");
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 0);
    }

    public void crearUsuario() {
        System.out.print("ID: ");
        int id = obj.nextInt();
        obj.nextLine();

        System.out.print("Nombre: ");
        String nombre = obj.nextLine();

        System.out.print("Email: ");
        String email = obj.nextLine();

        service.crearUsuario(id, nombre, email);

        System.out.println("Usuario creado ✅");
    }

    public void listarUsuarios() {
        var usuarios = service.listarUsuarios();

        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios");
        } else {
            for (var u : usuarios) {
                System.out.println("ID: " + u.id +
                        " | Nombre: " + u.nombre +
                        " | Email: " + u.email);
            }
        }
    }

    public void eliminarUsuario() {
        System.out.print("ID a eliminar: ");
        int id = obj.nextInt();

        service.eliminarUsuario(id);

        System.out.println("Usuario eliminado 🗑️");
    }
}