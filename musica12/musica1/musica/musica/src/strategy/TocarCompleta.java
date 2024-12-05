package strategy;

import model.Musica;
import java.util.List;

public class TocarCompleta implements EstrategiaReproducao {
    @Override
    public void reproduzir(List<Musica> playlist) {
        System.out.println("Reproduzindo todas as músicas:");
        for (Musica musica : playlist) {
            System.out.println(musica);
        }
    }
}
