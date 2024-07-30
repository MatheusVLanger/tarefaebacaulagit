package br.com.tarefas.ebac.matheus.langer;

public class Programa {

    public static void main(String[] args){
        //Exemplo usando contrutor
        PessoaFisica pf= new PessoaFisica("12345678", "Matheus");
        PessoaFisica pf2= new PessoaFisica("87654321", "Thomas");
        PessoaJuridica pj = new PessoaJuridica("Empresa do Theusao", "0001");

        System.out.println("O nome da pessoa física é "+pf.getNome()+ " e seu cpf é "+ pf.getCpf());
        System.out.println("O nome da pessoa jurídica é "+pj.getNome()+ " e seu cpf é "+ pj.getCnpj());

        pj.add(pf);
        pj.add(pf2);

        System.out.println("Os funcionários da empresa" + pj.getNome()+ " são "+ pj.getFuncionarios());

        // Exemplo usando set
        PessoaJuridica pj2 = new PessoaJuridica();
        pj2.setNome("Empresa mais rica que tem");
        pj2.setCnpj("0002");
        System.out.println("O nome da pessoa jurídica é "+pj2.getNome()+ " e seu cpf é "+ pj2.getCnpj());
    }
}
