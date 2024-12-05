package repository;

import model.Musica;
import java.util.ArrayList;
import java.util.List;

public class musicaRepository {

    private List<Musica> musicas = new ArrayList<>();

    public void salvar(Musica musica) {
        musicas.add(musica);
    }

    public List<Musica> listarTodas() {
        return new ArrayList<>(musicas);
    }

    public Musica buscarPorTitulo(String titulo) {
        return musicas.stream()
                .filter(m -> m.getTitulo().equalsIgnoreCase(titulo))
                .findFirst()
                .orElse(null);
    }
}

