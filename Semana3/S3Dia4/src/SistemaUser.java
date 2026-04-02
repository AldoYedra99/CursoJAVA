import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SistemaUser {
    private List<Users> usuarios;
    private int nextId;
    private Scanner scanner;

    public SistemaUser() {
        usuarios = new ArrayList<>();
        nextId = 1;
        scanner = new Scanner(System.in);
    }

    public void agregarUsuario() {
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese email: ");
        String email = scanner.nextLine();

        Users usuario = new Users(nextId, nombre, email);
        usuarios.add(usuario);
        nextId++;

        System.out.println("✅ Usuario agregado");
    }

    public void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("⚠️ No hay usuarios");
            return;
        }

        for (Users u : usuarios) {
            System.out.println(u);
        }
    }

    public void actualizarUsuario() {
        System.out.print("Ingrese ID del usuario a actualizar: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (Users u : usuarios) {
            if (u.getId() == id) {
                System.out.print("Nuevo nombre: ");
                u.setNombre(scanner.nextLine());

                System.out.print("Nuevo email: ");
                u.setEmail(scanner.nextLine());

                System.out.println("✅ Usuario actualizado");
                return;
            }
        }

        System.out.println("❌ Usuario no encontrado");
    }

    public void eliminarUsuario() {
        System.out.print("Ingrese ID del usuario a eliminar: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (Users u : usuarios) {
            if (u.getId() == id) {
                usuarios.remove(u);
                System.out.println("🗑️ Usuario eliminado");
                return;
            }
        }

        System.out.println("❌ Usuario no encontrado");
    }
}

