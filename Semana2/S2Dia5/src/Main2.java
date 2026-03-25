import java.util.Scanner;

public class Main2 {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);

        Administrador2 admin = new Administrador2();

        System.out.print("1- Usuario: ");
        admin.username=obj.nextLine();

        System.out.print("2- Contraseña: ");
        admin.password=obj.nextLine();

        System.out.print("3- Acceso: ");
        admin.nivelAcceso=obj.nextLine();

        System.out.println("1- "+admin.username);
        System.out.println("2- "+admin.password);
        System.out.println("3- "+admin.nivelAcceso);
    }
}
