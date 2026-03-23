import java.util.Scanner;

public class Main1 {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);

        Tema1 U1 = new Tema1();

        System.out.print("Nombre: ");
        U1.setNombre(obj.next());

        System.out.print("Edad: ");
        U1.setEdad(obj.nextInt());

        System.out.println("Nombre proporcionado: "+U1.getNombre());
        System.out.println("Edad proporcionada: "+U1.getEdad());
    }
}
