package br.com.matheus.ebac.com;

import br.com.matheus.ebac.com.cliente.Cliente;
import br.com.matheus.ebac.com.fabrica.marcas.FabricaAudi;
import br.com.matheus.ebac.com.fabrica.marcas.FabricaMercedes;

public class Main {

    public static void main(String[] args){
        Cliente cliente = new Cliente("Matheuus", false, true, "Audi");

        FabricaCarro carro= escolhaCarro(cliente);
        Carro carroEscolhido;

        if (cliente.getPiloto()){
           carroEscolhido = carro.criarCarroDeCorrida();
        }else if (cliente.getEntusiasta()){
            carroEscolhido = carro.criarCarroEsportivo();
        }else{
            carroEscolhido = carro.criarCarroPopular();
        }


        System.out.println("Carro escolhido tem as sguintes características : " + carroEscolhido.toString());

    }



    public static FabricaCarro escolhaCarro(Cliente cliente){
        if (cliente.getPreferenciaMarca().equals("Mercedes")) {
            return new FabricaMercedes();
        }else {
            return new FabricaAudi();
        }
    }
}
