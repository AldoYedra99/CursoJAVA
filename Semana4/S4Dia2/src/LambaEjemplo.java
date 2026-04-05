import java.util.ArrayList;
import java.util.Scanner;

public class LambaEjemplo {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.print("Cantidad de numeros: ");
        int cantidad = obj.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Numeros:"+(i+1));
            int num = obj.nextInt();

            numeros.add(num);
        }
        /*numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);*/

        System.out.println("Introduce el numero que desea buscar: ");
        int num = obj.nextInt();

        numeros.stream()
                .filter(n -> n > num)
                .forEach(System.out::println);
    }
}
