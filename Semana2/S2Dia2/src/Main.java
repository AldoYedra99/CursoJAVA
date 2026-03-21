import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        Producto p1 = new Producto();

        System.out.print("Ingrese el nombre del producto: ");
        p1.nombre=obj.nextLine();
        System.out.print("Ingrese precio del Producto: ");
        p1.precio=obj.nextDouble();

        System.out.println("Producto: "+p1.nombre);
        System.out.println("Precio: "+p1.precio);
    }
}
