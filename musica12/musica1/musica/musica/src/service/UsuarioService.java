package service;

import model.Usuario;
import repository.usuarioRepository;


public class UsuarioService {

    private final usuarioRepository  usuarioRepository = new usuarioRepository();

    public void cadastrarUsuario(Usuario usuario) {
        usuarioRepository.salvar(usuario);
    }

    public Usuario buscarUsuario(String nome) {
        return usuarioRepository.buscarPorNome(nome);
    }
}
