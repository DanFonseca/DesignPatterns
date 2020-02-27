package br.com.daniel.designPattern.FlyWight.ex1;

import org.jfugue.player.Player;

import java.util.List;

public class Piano {

    public void tocar (List<Nota> notas){
        Player player = new Player();
        StringBuilder musicaNotas = new StringBuilder();
        for (Nota nota: notas) {
            musicaNotas.append(nota.simbolo() + " ");
        }

        player.play(musicaNotas.toString());
    }
}
