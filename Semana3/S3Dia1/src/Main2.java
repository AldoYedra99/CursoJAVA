import java.util.Scanner;

public class Main2 {
    public static void main(String []args){
        Scanner obj = new Scanner(System.in);

        Usuario2 User1 = new Usuario2();
        Usuario2 Admin1 = new Admin2();
        Usuario2 Cli1 = new Cliente2();

        System.out.println("Seleccione tipo de Usuario:" +
                "\n1- Usuario básico" +
                "\n2- Administrador" +
                "\n3- Cliente");

        int id = obj.nextInt();

        if (id == 1){
            User1.mostrarPermisos();
        } else if (id == 2) {
            Admin1.mostrarPermisos();
        } else if (id == 3) {
            Cli1.mostrarPermisos();
        }else {
            System.out.println("Error!!!!");
        }
    }
}
