import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        ArrayList<Producto> productos = new ArrayList<>();

        System.out.print("Ingrese cantidad de Productos: ");
        int num = obj.nextInt();
        obj.nextLine();

        for (int i=1; i<=num; i++){
            System.out.println("Prodicto "+(i +1)+":");

            System.out.print("ID: ");
            int id = obj.nextInt();
            obj.nextLine();

            System.out.print("Nombre: ");
            String nombre = obj.nextLine();

            System.out.print("Precio: $");
            double precio = obj.nextDouble();
            obj.nextLine();

            productos.add(new Producto(id,nombre,precio));
        }
        for (Producto p: productos){
            if (p.id == 2){
                p.precio = 1999;
            }
            //productos.removeIf(p -> p.id ==3);
            System.out.println(p.id+" / "+p.nombre+" / "+p.precio);
        }
    }
}
