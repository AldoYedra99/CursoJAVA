import java.util.Scanner;

public class EjemploBackend {
    public static int calcularTotal(int precio, int cantidad){
        return precio * cantidad;
    }
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);

        System.out.println("Precio");
        int precio=obj.nextInt();

        System.out.println("Cantidad");
        int cantidad=obj.nextInt();

        int total=calcularTotal(precio,cantidad);

        System.out.println("Total: : "+total);
    }
}
