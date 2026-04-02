import java.util.ArrayList;
import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        ArrayList<usuarios> users = new ArrayList<>();

        int opcion;
        do {
            System.out.println("--> SISTEMA DE USUARIOS <--");
            System.out.println("1. Agregar usuario");
            System.out.println("2. Ver usuarios");
            System.out.println("3. Actualizar usuario");
            System.out.println("4. Eliminar usuario");
            System.out.println("5. Salir");

            System.out.print("Elije una opción:");
             opcion = obj.nextInt();
            switch (opcion) {
            case 1:
                System.out.print("ID: ");
                int id = obj.nextInt();
                obj.nextLine();

                System.out.print("Nombre: ");
                String nombre = obj.nextLine();

                System.out.print("Email: ");
                String email = obj.nextLine();

                users.add(new usuarios(id, nombre, email));
                System.out.println("Agregado Correctamente ✅");
                break;
            case 2:
                for (usuarios u : users) {
                    System.out.println(u.id + "/" + u.nombre + "/" + u.email + "/");
                }
                break;
                case 3:
                    System.out.print("ID del usuario: ");
                    int idActualizar = obj.nextInt();
                    obj.nextLine();

                    for (usuarios u : users) {
                        if (u.id == idActualizar) {
                            System.out.print("nuevo nombre: ");
                            u.nombre = obj.nextLine();

                            System.out.print("Nuevo email: ");
                            u.email = obj.nextLine();

                            System.out.print("Usuario Actualizado ✅");
                        }
                    }
                    break;
                    case 4:
                        System.out.print("ID del usuario a eliminar: ");
                        int idEliminar = obj.nextInt();
                        obj.nextLine();

                        users.removeIf(u -> u.id == idEliminar);
                        System.out.print("Usuario Eliminado ❌");
                        break;

            }
        }while (opcion != 5);
    }
}
