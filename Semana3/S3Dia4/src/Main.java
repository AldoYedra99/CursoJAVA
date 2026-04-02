import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        ArrayList<Usuario> usuario = new ArrayList<>();
        Scanner obj = new Scanner(System.in);


        System.out.print("Ingrese numero de Usuarios:");
        int num = obj.nextInt();
        obj.nextLine();

        for (int i = 0; i<num; i++){
            System.out.println("Usuario (" + (i+1) + "):");

            System.out.print("ID: ");
            int id = obj.nextInt();
            obj.nextLine();

            System.out.print("Nombre: ");
            String nombre = obj.nextLine();

            usuario.add(new Usuario(id, nombre));
        }
        for (Usuario u: usuario){
            if (u.id == 2) {
                u.nombre = "Actualizado";

            }
            //usuario.removeIf(x -> x.id == 3);
            System.out.println(u.id+" - "+u.nombre);
        }
    }
}
