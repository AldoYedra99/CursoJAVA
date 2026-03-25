import java.util.Scanner;

public class Main1 {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);

        Empleado1 emp = new Empleado1();

        System.out.print("1- Nombre :");
        emp.nombre = obj.nextLine();

        System.out.print("2- Edad: ");
        emp.edad = obj.nextInt();

        System.out.print("3- Salario: ");
        emp.salario = obj.nextInt();

        System.out.println("1- "+emp.nombre+"\n2- "
        +emp.edad+"\n3- "+emp.salario);
    }
}
