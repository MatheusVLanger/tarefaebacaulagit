package br.com.tarefas.ebac.matheus.langer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PessoaJuridica extends Pessoa{

    private String cnpj;
    private List<PessoaFisica> funcionarios = new ArrayList<>();

    public PessoaJuridica(){

    }

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<PessoaFisica> getFuncionarios() {
        return funcionarios;
    }

    public void add(PessoaFisica funcionarios) {
        this.funcionarios.add(funcionarios);
    }
}
