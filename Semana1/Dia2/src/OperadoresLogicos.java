import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String []args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Ingrese número A:");
        int a= obj.nextInt();
        System.out.print("Ingrese número B:");
        int b= obj.nextInt();

        //System.out.println("Suma: "+(a+b));
        //System.out.println("Resta: " +(a-b));
        //System.out.println("Multiplicación: "+(a*b));
        //System.out.println("Division: "+(a/b));
        System.out.print("Residuo: " +(a%b));
    }

}
