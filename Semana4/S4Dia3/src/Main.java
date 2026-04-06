import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Usuarios> usuarios = new ArrayList<>();

        try {

        BufferedReader reader = new BufferedReader(new FileReader("Usuarios.txt"));
        String linea;

        while ((linea = reader.readLine()) != null){
            String[] datos = linea.split("\\|");

            Usuarios u = new Usuarios(
                    Integer.parseInt(datos[0].trim()),
                    datos[1].trim(),
                    datos[2].trim()
            );
            usuarios.add(u);
        }
            reader.close();
        }catch (IOException e){
            System.out.println("Error!!!❌"+e.getMessage());
        }
        for (Usuarios u : usuarios) {
            System.out.println(u.id+" | "+ u.nombre+" | "+u.correo);
        }
    }
}
