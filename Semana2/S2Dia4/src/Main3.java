import java.util.Scanner;

public class Main3 {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);

        Ejercicio3 est1 = new Ejercicio3();

        System.out.print("Estudinte: ");
        est1.setNombre(obj.nextLine());

        System.out.print("Edad: ");
        est1.setEdad(obj.nextInt());
        obj.nextLine();

        System.out.print("Carrera: ");
        est1.setCarrera(obj.nextLine());

        System.out.println("DATOS: \n"+est1.getNombre());
        System.out.println(est1.getEdad());
        System.out.println(est1.getCarrera());
    }
}
