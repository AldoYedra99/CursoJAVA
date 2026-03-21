import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        Producto p1 = new Producto();

        System.out.print("Producto: ");
        p1.nombre=obj.nextLine();
        System.out.print("Precio : ");
        p1.precio=obj.nextDouble();

        p1.mostrarProducto();
    }
}
