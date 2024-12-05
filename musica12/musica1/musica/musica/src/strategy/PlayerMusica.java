package strategy;

import model.Musica;
import java.util.List;

public class PlayerMusica {
    private EstrategiaReproducao estrategiaReproducao;

    public void setEstrategiaReproducao(EstrategiaReproducao estrategiaReproducao) {
        this.estrategiaReproducao = estrategiaReproducao;
    }

    public void tocarMusica(List<Musica> playlist) {
        estrategiaReproducao.reproduzir(playlist);
    }
}
