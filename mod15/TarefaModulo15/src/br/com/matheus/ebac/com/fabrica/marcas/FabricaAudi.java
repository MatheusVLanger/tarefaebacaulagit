package br.com.matheus.ebac.com.fabrica.marcas;

import br.com.matheus.ebac.com.Carro;
import br.com.matheus.ebac.com.FabricaCarro;
import br.com.matheus.ebac.com.marcas.CarroAudi;


public class FabricaAudi implements FabricaCarro {
    @Override
    public Carro criarCarroEsportivo() {
        return new CarroAudi("R8", "Esportivo", "Cinza", 800);
    }

    @Override
    public Carro criarCarroPopular() {
        return new CarroAudi("A3", "Popular", "Cinza", 230);
    }

    @Override
    public Carro criarCarroDeCorrida() {
        return new CarroAudi("Fórmula 1", "Corrida", "Cinza", 1800);
    }
}
