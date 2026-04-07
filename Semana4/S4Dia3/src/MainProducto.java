import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MainProducto {
    public static void main(String [] args){

        ArrayList<Producto> productos = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("productos.txt"));
            String linea;

            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(" \\| ");

                Producto p = new Producto(
                        Integer.parseInt(datos[0].trim()),
                        datos[1].trim(),
                        Double.parseDouble(datos[2].trim())
                );
                productos.add(p);
            }
            reader.close();
        }catch(IOException e) {
            System.out.println("Error!!!❌" + e.getMessage());
        }
        for (Producto p : productos) {
            System.out.println(p.id+" | "+p.nombre+" | "+p.precio);
        }
    }
}
