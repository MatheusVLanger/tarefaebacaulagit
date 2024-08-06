package br.com.matheus.ebac.com.fabrica.marcas;

import br.com.matheus.ebac.com.Carro;
import br.com.matheus.ebac.com.FabricaCarro;
import br.com.matheus.ebac.com.marcas.CarroMercedes;

public class FabricaMercedes implements FabricaCarro {
    @Override
    public Carro criarCarroEsportivo() {
        return new CarroMercedes("AMG", "Esportivo", "Cinza", 750);
    }

    @Override
    public Carro criarCarroPopular() {
        return new CarroMercedes("GLA", "Popular", "Preto", 230);
    }

    @Override
    public Carro criarCarroDeCorrida() {
        return new CarroMercedes("Fórmula 1", "Corrida", "Preto", 1830);
    }
}
