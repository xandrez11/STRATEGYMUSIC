package repository;

import model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class usuarioRepository {

    private List<Usuario> usuarios = new ArrayList<>();

    public void salvar(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> listarTodos() {
        return new ArrayList<>(usuarios);
    }

    public Usuario buscarPorNome(String nome) {
        return usuarios.stream()
                .filter(u -> u.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }
}
