import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefa {

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite nome de pesssoas separados por vírgula, e seus sexos após o nome com um -");

        String nomesComVirgula= scanner.next().toLowerCase();
        String[] nomes= nomesComVirgula.split(",");
        List<String> listaMasculina= new ArrayList<String>();
        List<String> listaFeminina= new ArrayList<String>();



        for (String nome : nomes) {
            if (nome.contains("-m")) {
                listaMasculina.add(nome.replace("-m",""));
            }else if (nome.contains("-f")){
                listaFeminina.add(nome.replace("-f",""));
            }
        }

        System.out.println("Os homens são: "+listaMasculina);
        System.out.println("As mulheres são: "+listaFeminina);

    }
}
