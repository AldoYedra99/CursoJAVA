import java.util.Scanner;

public class Main1 {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);

        Polimorfismo1 p1 = new Empleado1();
        Polimorfismo1 p2 = new Estudiante1();
        Polimorfismo1 p3 = new Polimorfismo1();

        System.out.print("Nombre: ");
        p1.nombre=obj.nextLine();

        System.out.print("Nombre: ");
        p2.nombre=obj.nextLine();

        System.out.print("Nombre ");
        p3.nombre=obj.nextLine();

        p1.mostrarRol();
        p2.mostrarRol();
        p3.mostrarRol();
    }
}
