import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String []args){
        Scanner obj = new Scanner(System.in);
        //System.out.print("Ingrese número A:");
        //int a= obj.nextInt();
        //System.out.print("Ingrese número B:");
        //int b= obj.nextInt();

        /*System.out.println("Cual es tu edad");
        int edad= obj.nextInt();
        boolean INE= edad>=18; */

        /*System.out.println("Ingrese precio $");
        int precio= obj.nextInt();
        System.out.println("Ingrese cantidad");
        int cantidad= obj.nextInt();

        int total= precio*cantidad;*/

        System.out.println("Ingrese un Número");
        int numero= obj.nextInt();

        boolean entonces= numero % 2==0;

        //System.out.println("Suma: "+(a+b));
        //System.out.println("Resta: " +(a-b));
        //System.out.println("Multiplicación: "+(a*b));
        //System.out.println("Division: "+(a/b));
        //System.out.print("Residuo: " +(a%b));
        //System.out.println("Mayor de edad: " +INE);
        //System.out.println("Total de compra: $"+total);

        System.out.println(+numero+" Es divisible entre 2?.... "+entonces);
    }

}
