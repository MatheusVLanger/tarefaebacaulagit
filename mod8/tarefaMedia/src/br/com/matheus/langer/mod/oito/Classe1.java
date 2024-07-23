package br.com.matheus.langer.mod.oito;

public class Classe1 {

    public static void main(String[] args){
        
        System.out.println(calculoMedia(9,8,7,6));

    }




    private static String calculoMedia(double n1, double n2, double n3,double n4){

        return "A média do aluno Matheus deu " + (n1+n2+n3+n4)/4;
    }
}
