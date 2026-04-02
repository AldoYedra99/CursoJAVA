import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        SistemaUser sistema = new SistemaUser();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar usuario");
            System.out.println("2. Listar usuarios");
            System.out.println("3. Actualizar usuario");
            System.out.println("4. Eliminar usuario");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opción: ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    sistema.agregarUsuario();
                    break;
                case "2":
                    sistema.listarUsuarios();
                    break;
                case "3":
                    sistema.actualizarUsuario();
                    break;
                case "4":
                    sistema.eliminarUsuario();
                    break;
                case "5":
                    System.out.println("👋 Saliendo...");
                    return;
                default:
                    System.out.println("❌ Opción inválida");
            }
        }
    }
}