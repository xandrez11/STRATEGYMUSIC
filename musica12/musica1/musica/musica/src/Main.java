import strategy.*;
import model.Musica;
import model.Usuario;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica(" Elementares, 1", "joao");
        Musica musica2 = new Musica("Cereja, 2", "matheus");
        Musica musica3 = new Musica("Mundo da Lua, 3", "maria");
        Musica musica4 = new Musica("Amor, 4", "jose");
        Musica musica5 = new Musica("Saturno, 5", "clara");

        Usuario usuario = new Usuario("João");

        usuario.adicionarMusica(musica1);
        usuario.adicionarMusica(musica2);
        usuario.adicionarMusica(musica3);
        usuario.adicionarMusica(musica4);
        usuario.adicionarMusica(musica5);

        PlayerMusica player = new PlayerMusica();


        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("1 - Reprodução completa");
            System.out.println("2 - Reprodução de uma música específica");
            System.out.println("3 - Reprodução de prévias");
            System.out.println("0 - Sair");
            System.out.println("Selecione o tipo de reprodução:");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    player.setEstrategiaReproducao(new TocarCompleta());
                    System.out.println("Reprodução completa:");
                    player.tocarMusica(usuario.getPlaylist());
                    break;
                case 2:
                    System.out.print("Informe a posição da música (0 para a primeira): ");
                    int posicao = scanner.nextInt();
                    player.setEstrategiaReproducao(new TocarDePosicao(posicao));
                    System.out.println("\nReprodução de uma música específica:");
                    player.tocarMusica(usuario.getPlaylist());
                    break;

                case 3:
                    List<Musica> playlist = usuario.getPlaylist();
                    System.out.println("Lista de músicas:");
                    for (int i = 0; i < playlist.size(); i++) {
                        System.out.println(i + " - " + playlist.get(i).getTitulo() + " by " + playlist.get(i).getArtista());
                    }
                    System.out.print("Informe a posição da música para a prévia (0 para a primeira): ");
                    int posicaoPrevia = scanner.nextInt();
                    player.setEstrategiaReproducao(new TocarPrevia(posicaoPrevia));
                    System.out.println("\nReprodução de prévias:");
                    System.out.println("Reproduzindo prévia da música da posição " + posicaoPrevia + ":");
                    System.out.println(usuario.getPlaylist().get(posicaoPrevia));
                    player.tocarMusica(usuario.getPlaylist());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
