import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        ArrayList<Productos> producto = new ArrayList<>();

        System.out.print("Cantidad de productos: ");
        int cantidad = obj.nextInt();
        obj.nextLine();

        for (int i=0; i<cantidad; i++){
            System.out.println("Producto N°"+(i+1)+":");

            System.out.print("Nombre: ");
            String nombre = obj.nextLine();

            System.out.print("Precio: ");
            double precio = obj.nextDouble();
            obj.nextLine();

            producto.add(new Productos(nombre,precio));
        }
        producto.stream()
                .filter(p -> p.precio > 1000)
                .forEach(p -> System.out.println(p.nombre+" | "+p.precio));
    }
}
