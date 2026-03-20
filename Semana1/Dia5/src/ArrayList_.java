import java.util.ArrayList;
public class ArrayList_ {
    public static void main(String []args){

        /*
        ArrayList<String> usuarios = new ArrayList<>();
        usuarios.add("Aldo");
        usuarios.add("Brenda");
        usuarios.add("Tyrone");
        usuarios.add("Jesus");
        usuarios.add("Josue");

        for (String u : usuarios) {
            System.out.println("Estudiante: "+u);
        }*/
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        int suma = 0;
        for(int numero : numeros){
            suma += numero;
        }
        System.out.println("Suma Total:"+ suma);
    }
}
