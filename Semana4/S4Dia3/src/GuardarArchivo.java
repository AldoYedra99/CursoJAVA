import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class GuardarArchivo {
    public static void main(String []args){
        Scanner obj = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("usuarios.txt");

            System.out.print("¿Cuantos usuarios vas a registrar? ");
            int cantidad = obj.nextInt();
            obj.nextLine();

            for (int i=0; i<cantidad; i++){
                System.out.println("Usuario "+(i+1)+":");

                System.out.print("Ingrede ID: ");
                int id = obj.nextInt();
                obj.nextLine();

                System.out.print("Ingrese Nombre: ");
                String nombre = obj.nextLine();

                System.out.print("Ingrese Correo: ");
                String correo = obj.nextLine();

                writer.write(id+" | "+nombre+" | "+correo+"\n");
            }

            writer.close();
            obj.close();

            System.out.println("Datos guardados exitosamente!!! ✅");
        }catch (IOException e){
            System.out.println("Error al guardar el archivo!!!❌");

        }
    }
}
