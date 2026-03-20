import java.util.Scanner;

public class MetodosConParametros {
    /*public static void saludar(String nombre){
        System.out.println("Hola "+nombre);
    }
    public static void main(String[] args) {
        saludar("Aldo");
    }*/

    public static int sumar(int num1, int num2){
        int resultado=num1+num2;
        return resultado;
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Digite un Número");
        int num1 = obj.nextInt();
        System.out.print("Digite un Número");
        int num2 = obj.nextInt();
        int total = sumar(num1, num2);
        System.out.println("Resultado: "+total);
    }
}
