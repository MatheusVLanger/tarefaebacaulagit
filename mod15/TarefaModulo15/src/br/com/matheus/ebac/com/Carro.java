package br.com.matheus.ebac.com;

public abstract class Carro {

    private String nome;
    private Integer cavalos;
    private String cor;
    private String categoria;

    public Carro(String nome, String categoria, String cor, Integer cavalos) {
        this.nome = nome;
        this.categoria = categoria;
        this.cor = cor;
        this.cavalos = cavalos;
    }

     void carroPronto(){
        System.out.println("Carro pronto para o uso");
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", cavalos=" + cavalos +
                ", cor='" + cor + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
