package strategy;

import model.Musica;
import java.util.List;

public class TocarPrevia implements EstrategiaReproducao {

    public TocarPrevia(int posicaoPrevia) {
    }


    @Override
    public void reproduzir(List<Musica> playlist) {
        System.out.println("Reproduzindo prévia das músicas:");
        for (Musica musica : playlist) {
            System.out.println("Prévia: " + musica.getTitulo() + " - " + musica.getArtista());
        }
    }
}
