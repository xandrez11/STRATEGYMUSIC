package strategy;

import model.Musica;
import java.util.List;

public class TocarDePosicao implements EstrategiaReproducao {

    private final int posicao;

    public TocarDePosicao(int posicao) {
        this.posicao = posicao;
    }

    @Override
    public void reproduzir(List<Musica> playlist) {
        if (posicao >= 0 && posicao < playlist.size()) {
            System.out.println("Reproduzindo música da posição " + posicao + ":");
            System.out.println(playlist.get(posicao));
        } else {
            System.out.println("Posição inválida.");
        }
    }
}
