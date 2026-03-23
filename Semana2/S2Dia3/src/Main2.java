import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Producto: ");
        String nombre=obj.nextLine();

        System.out.print("Costo: ");
        double precio=obj.nextDouble();

        Constructor2 p1= new Constructor2(nombre,precio);

        p1.mostrarProducto();
    }
}
