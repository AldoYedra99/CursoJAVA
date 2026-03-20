import java.util.Scanner;

public class Bucles {
    public static void main(String[] args){
        Scanner obj= new Scanner(System.in);

        /*FOR
        for (int i=1; i<=5; i++){
            System.out.println("Procesando Usuario: "+i);
        }*/

        /*WHILE
        int i=1;
        while(i <= 5){
            System.out.println(i);
            i++;
        }*/

        /*DO WHILE
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }while (i <= 10); */
        System.out.print("Ingrese un Número:");
        int num=obj.nextInt();

        for(int i =1; i<=num; i++){
            if(i%2==0) {
                System.out.println(+i + ": Par");}
            else{
                System.out.println(+i + ": Impar");
            }
            //Tabla de Multiplicar
        /*for(int a=1; a<=10; a++){
            System.out.println(+a+" X "+num+ " = "+(num*a));
        }*/
        }
    }
}
