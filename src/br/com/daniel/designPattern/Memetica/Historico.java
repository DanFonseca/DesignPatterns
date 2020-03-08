package br.com.daniel.designPattern.Memetica;

import java.util.ArrayList;
import java.util.List;

public class Historico {
    private List<Estado> estadosSalvos = new ArrayList<>();

    public void guardaEstado (Estado estado){
        estadosSalvos.add(estado);
    }

    public Estado pegaHistorico (int index){
        return this.estadosSalvos.get(index);
    }

}
