package service;

import model.Musica;
import repository.musicaRepository;

import java.util.List;

public class MusicaService {

    private final musicaRepository musicaRepository = new musicaRepository();

    public void adicionarMusica(Musica musica) {
        musicaRepository.salvar(musica);
    }

    public List<Musica> listarMusicas() {
        return musicaRepository.listarTodas();
    }
}
