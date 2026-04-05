import java.util.Scanner;

public class ejemplo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        try {
            System.out.println("Ingrese números: ");
            int n1 = obj.nextInt();
            int n2 = obj.nextInt();

           int resultado = n1 / n2;

           System.out.println(resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error!!! ❌");
        }
    }
}
