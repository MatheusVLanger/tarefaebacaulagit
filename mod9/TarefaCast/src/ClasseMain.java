import java.util.Scanner;

public class ClasseMain {
    public static void main (String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite um número");

        int num= scanner.nextInt();
        System.out.println(num);

        Integer num2= num;
        System.out.println(num2);


    }
}
