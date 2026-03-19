import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Ingres su Usuario:");
        String usuario=obj.nextLine();
        System.out.println("Ingres su Contrasenia:");
        String password=obj.nextLine();

       if (usuario.equals("admin") &&
       password.equals("1234")){
           System.out.println("Bienvenido '"+usuario+"' al Sistema");
       }else {
           System.out.println("Acceso Denegado");
       }
    }
}
