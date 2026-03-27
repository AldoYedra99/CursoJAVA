import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        Animal perro = new Perro();
        Animal gato = new Gato();

        perro.hacerSonido();
        gato.hacerSonido();
    }
}
