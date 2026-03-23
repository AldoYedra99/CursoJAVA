import java.util.Scanner;

public class Main2 {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);

        Ejemplo2 p1 = new Ejemplo2();

        System.out.print("Ingrese producto: ");
        p1.setNombre(obj.nextLine());

        System.out.print("Ingrese precio: ");
        p1.setPrecio(obj.nextDouble());

        System.out.println("Producto: "+p1.getNombre()+
                "\nPrecio: "+p1.getPrecio());

    }
}
