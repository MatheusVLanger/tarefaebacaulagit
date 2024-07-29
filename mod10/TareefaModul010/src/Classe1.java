import java.util.Scanner;

public class Classe1 {

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Digite as 4 notas do seu aluno");
        double n1= scanner.nextDouble();
        double n2= scanner.nextDouble();
        double n3= scanner.nextDouble();
        double n4= scanner.nextDouble();

        System.out.println(calculoMedia(n1, n2, n3, n4));

    }

    public static String calculoMedia(double n1, double n2, double n3, double n4){
        double media = (n1+n2+n3+n4)/4;

        if(media>=7.0){
            return "O Aluno foi aprovado com a média "+ media;
        } else if (media<7.0 && media>5.0) {
            return "Aluno ficou em recuperação com a média "+ media;
        }
        else {
            return "O Aluno foi reprovado com a média "+ media;
        }
    }
}
