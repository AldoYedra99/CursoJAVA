import java.util.Scanner;

public class ejemplo2 {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número: ");
            int numero = obj.nextInt();

            System.out.println("Número: "+numero);
        } catch (Exception e) {
            System.out.println("Debes ingresar un número");
        }finally {
            System.out.println("Proceso Terminado");
        }
    }
}
