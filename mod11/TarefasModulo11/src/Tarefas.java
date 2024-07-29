import java.util.*;

public class Tarefas {
    static Scanner scanner= new Scanner(System.in);
    public static  void main(String[] args){
        System.out.println("Digite 1 para corrigir a tarefa 1, 2 para corrigir a tarefa 2 " +
                "e 3 para sair do programa");
        int numSwitch= scanner.nextInt();
        boolean rodando=true;
        while (rodando) {
            switch (numSwitch) {
                case 1:
                    tarefa1();
                    System.out.println("Digite 1 para corrigir a tarefa 1, 2 para corrigir a tarefa 2 " +
                            "e 3 para sair do programa");
                    numSwitch= scanner.nextInt();
                    break;
                case 2:
                    tarefa2();
                    System.out.println("Digite 1 para corrigir a tarefa 1, 2 para corrigir a tarefa 2 " +
                            "e 3 para sair do programa");
                    numSwitch= scanner.nextInt();
                    break;
                case 3:
                    System.out.println("Obrigado por corrigir minha tarefa");
                    rodando = false;
            }
        }

    }


    public static void tarefa1(){
        System.out.println("Digite nome de pesssoas separados por vírgula");
        String nomesComVirgula= scanner.next().toLowerCase(Locale.ROOT);
        String[] nomes= nomesComVirgula.split(",");
        List<String> lista= new ArrayList<String>();

        Collections.addAll(lista, nomes);
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);

    }

    public static void tarefa2(){
        System.out.println("Digite nome de pesssoas separados por vírgula, e seus sexos após o nome com um -");
        String nomesComVirgula= scanner.next().toLowerCase(Locale.ROOT);
        String[] nomes= nomesComVirgula.split(",");
        List<String> listaMasculina= new ArrayList<String>();
        List<String> listaFeminina= new ArrayList<String>();



        for (String nome : nomes) {
            if (nome.contains("-m")) {
                listaMasculina.add(nome);
            }else if (nome.contains("-f")){
                listaFeminina.add(nome);
            }
        }

        System.out.println("Os homens são: "+listaMasculina);
        System.out.println("As mulheres são: "+listaFeminina);

    }

}
