import java.util.Scanner;

public class Main4 {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);

        Ejercicio4 admin = new Ejercicio4();

        System.out.print("Ingrese Usuario: ");
        admin.setUsername(obj.nextLine());

        System.out.print("Ingrese Contraseña: ");
        admin.setPassword(obj.nextLine());

        System.out.print("Ingrese Rol: ");
        admin.setRol(obj.nextLine());

        System.out.println("User: "+admin.getUsername());
        System.out.println("Password: "+admin.getPassword());
        System.out.println("Rol: "+admin.getRol());
    }
}
