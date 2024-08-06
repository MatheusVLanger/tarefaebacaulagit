package br.com.matheus.ebac.com.cliente;

public class Cliente {

    private String nome;
    private Boolean piloto;
    private Boolean entusiasta;
    private String preferenciaMarca;

    public Cliente(String nome, Boolean entusiasta, Boolean piloto, String preferenciaMarca) {
        this.nome = nome;
        this.entusiasta = entusiasta;
        this.piloto = piloto;
        this.preferenciaMarca = preferenciaMarca;
    }

    public String getNome() {
        return nome;
    }

    public Boolean getEntusiasta() {
        return entusiasta;
    }

    public Boolean getPiloto() {
        return piloto;
    }

    public  String getPreferenciaMarca(){
        return preferenciaMarca;
    }


}
