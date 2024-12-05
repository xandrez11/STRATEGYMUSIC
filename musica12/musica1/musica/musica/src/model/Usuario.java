package model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private List<Musica> playlist;

    public Usuario(String nome) {
        this.nome = nome;
        this.playlist = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Musica> getPlaylist() {
        return playlist;
    }

    public void adicionarMusica(Musica musica) {
        playlist.add(musica);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", playlist=" + playlist +
                '}';
    }
}
