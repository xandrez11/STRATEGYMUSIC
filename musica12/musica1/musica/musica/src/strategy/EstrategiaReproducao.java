package strategy;

import model.Musica;

import java.util.List;

public interface EstrategiaReproducao {

    void reproduzir(List<Musica> playlist);
}
