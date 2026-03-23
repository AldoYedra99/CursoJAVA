import java.util.Scanner;

public class Main5 {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Usuario: ");
        String username = obj.nextLine();

        System.out.print("Password: ");
        String password = obj.nextLine();

        System.out.print("Rol: ");
        String rol = obj.nextLine();

        Ejercicio5 admin = new Ejercicio5(username,password,rol);

        System.out.println("usuario: "+username);
        System.out.println("password: "+password);
        System.out.println("rol: "+rol);
    }
}
