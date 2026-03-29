import java.util.Scanner;
import java.util.ArrayList;

public class Main2 {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        ArrayList<Users> usuario = new ArrayList<>();

        System.out.print("Ingrese cantidad de usuarios: ");
        int num = obj.nextInt();
        obj.nextLine();

        for(int i = 0; i < num; i++){
            System.out.println("Usuario " + (i+1) + ":");

            System.out.print("ID: ");
            int id = obj.nextInt();
            obj.nextLine();

            System.out.print("Nombre: ");
            String nombre = obj.nextLine();

            System.out.print("Rol: ");
            String rol = obj.nextLine();

            usuario.add(new Users(id, nombre, rol));
        }
        System.out.println("Lista de usuarios:");
        for(Users u: usuario){
            System.out.println(u.id+"/"+u.nombre+"/"+u.rol);
        }
    }
}
