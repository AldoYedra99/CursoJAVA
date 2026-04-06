import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("usuarios.txt"));
            String linea;
             while((linea = reader.readLine()) != null){
                 System.out.println(linea);
             }

             reader.close();
        }catch (IOException e){
            System.out.println("Error al leer el archivo");
        }
    }
}
