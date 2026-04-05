import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner obj = new Scanner(System.in);
        ArrayList<Usuario> usuarios = new ArrayList<>();

        System.out.print("Ingrese el numero de usuarios que desea Ingresar: ");
        int cantidad = obj.nextInt();
        obj.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Usuario (" + (i + 1) + ") --> ");

            System.out.print("Nombre: ");
            String nombre = obj.nextLine();

            System.out.print("Edad: ");
            int edad = obj.nextInt();
            obj.nextLine();

            usuarios.add(new Usuario(nombre, edad));
        }
        //Filtrar por edad
        /*System.out.print("Ingrese edad: ");
        int num = obj.nextInt();
        usuarios.stream()
                .filter(u -> u.edad >= num)
                .forEach(u -> System.out.println(u.nombre+" | "+u.edad));*/

        //Buscar por nombre
        /*System.out.print("Ingrese Nombre del usuario: ");
        String nom = obj.nextLine();
        usuarios.stream()
                .filter(u -> u.nombre.equals(nom))
                .findFirst()
                .ifPresent(u -> System.out.println(u.nombre+" | "+u.edad));*/

        //Convertir datos (map)
        usuarios.stream()
                .map(u -> u.nombre)
                .forEach(System.out::println);
    }
}
