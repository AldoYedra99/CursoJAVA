import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);

        ArrayList<Productos> producto = new ArrayList<>();

        System.out.print("Ingrese Cantidad de Productos: ");
        int cantidad = obj.nextInt();
        obj.nextLine();

        for (int i=0; i<cantidad; i++){
            System.out.println("Productos: "+(i +1));

            System.out.print("Nombre: ");
            String nombre = obj.nextLine();

            System.out.print("Precio: ");
            int precio = obj.nextInt();
            obj.nextLine();

            producto.add(new Productos(nombre, precio));
        }
        System.out.println("PRODUCTOS");
        for (Productos p: producto){
            System.out.println(p.nombre+" - "+p.precio);
        }
    }
}
