import java.util.ArrayList;
public class Tema1 {

    public static void main(String[] args) {
        ArrayList<Usuarios> usuario = new ArrayList<>();

        usuario.add(new Usuarios("Aldo","aldojonat@gmail.com"));
        usuario.add(new Usuarios("Josue","josue89@gmail.com"));
        usuario.add(new Usuarios("Jesus","gordo1333@hotmail.com"));

        for(Usuarios u: usuario){
            System.out.println(u.nombre+" - "+u.email);
        }
    }
}

