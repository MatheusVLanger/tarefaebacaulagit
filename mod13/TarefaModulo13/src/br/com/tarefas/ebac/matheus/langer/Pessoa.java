package br.com.tarefas.ebac.matheus.langer;

public abstract class Pessoa {

    public Pessoa(){

    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
