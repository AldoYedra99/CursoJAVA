import java.util.Scanner;

public class Estudinte1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        Estudiante u1 = new Estudiante();

        System.out.print("Ingrese nombre: ");
        u1.nombre=obj.nextLine();
        System.out.print("Ingrese carrera: ");
        u1.carrera=obj.nextLine();
        System.out.print("Ingrese edad: ");
        u1.edad=obj.nextInt();

        System.out.println("DATOS: \nNombre: "+u1.nombre+
                "\nCarrera: "+u1.carrera+
                "\nEdad: "+u1.edad);
    }
}
