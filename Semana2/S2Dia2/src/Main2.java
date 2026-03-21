import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        User u1 = new User();

        u1.username = "admin";
        u1.password = "1234";

        System.out.print("Usuario: ");
        String user=obj.nextLine();

        System.out.print("Contraseña: ");
        String pass=obj.nextLine();

        u1.login(user, pass);
    }
}
