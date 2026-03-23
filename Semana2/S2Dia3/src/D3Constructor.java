import java.util.Scanner;

public class D3Constructor {
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = obj.nextLine();

        System.out.print("Edad: ");
        int edad = obj.nextInt();

        ConstructorUser u1 = new ConstructorUser(nombre, edad);

        System.out.println("Nombre: "+u1.nombre);
        System.out.println("Edad: "+u1.edad);
    }
}

