import java.util.Scanner;

public class Impresiones {
    public static void main(String []args){
        Scanner obj = new Scanner(System.in);
        /*System.out.println("Hola Aldo");
        System.out.println("JAVA for BackEnd");b*/

        /*String nombre= "Aldo";
        int edad= 26;
        double altura= 1.78;
        String carrera= "Ing en Sistemas Computacionales";

        System.out.println("Mi nombre es "+nombre+
                " y tengo "+edad+ " años y estudio "+carrera); */

        /*String producto= "Laptop";
        double precio= 14999.00;
        int cantidad= 2;

        double total = precio*cantidad;

        System.out.println("Producto: "+producto+
                "\nPrecio: "+precio+
                "\nCantidad: "+cantidad+
                "\nTotal: $"+total); */

        System.out.println("Ingrese Datos \n1- Universidad \n2- Carrera \n3- Nombre");
        String univerdidad= obj.nextLine();
        String carrera= obj.nextLine();
        String nombre= obj.nextLine();

        System.out.println("DATOS: \nUniversidad: "+univerdidad+
                "\nCarrera: "+carrera+
                "\nNombre de Alumno: "+nombre);

    }
}
