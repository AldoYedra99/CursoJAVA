import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);

        Animal a1 = new Perro();
        Animal a2 = new Gato();

        String animal;

        System.out.print("Ingrese Animal (Perro o Gato); ");
        animal = obj.nextLine();

        if (animal.equals("Perro") || animal.equals("perro")){
            a1.hacerSonido();
        } else if (animal.equals("Gato") || animal.equals("gato")) {
            a2.hacerSonido();
        }else {
            System.out.println("Error!!!");
        }
    }
}
