import java.util.Scanner;

public class Main3 {
    public static void main(String[]args ){
        Scanner obj = new Scanner(System.in);

        System.out.print("Nombre del Estudiante: ");
        String nombre = obj.nextLine();

        System.out.print("Carrera: ");
        String carrera = obj.nextLine();

        System.out.print("Edad: ");
        int edad = obj.nextInt();

        Ejercicio3 U1 = new Ejercicio3(nombre, carrera, edad);

        System.out.println("Estudiante: "+U1.nombre);
        System.out.println("Carrera: "+U1.carrera);
        System.out.println("Edad: "+U1.edad);
    }
}
