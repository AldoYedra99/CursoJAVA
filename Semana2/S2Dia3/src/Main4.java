import java.util.Scanner;

public class Main4 {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto: ");
        String nombre = obj.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double precio = obj.nextDouble();

        Ejercicio4 p1 = new Ejercicio4(nombre,precio);

        p1.mostrarProducto();
    }
}
