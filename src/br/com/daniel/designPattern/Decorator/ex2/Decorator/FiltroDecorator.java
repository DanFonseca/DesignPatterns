package br.com.daniel.designPattern.Decorator.ex2.Decorator;

import br.com.daniel.designPattern.Decorator.ex2.Classes.Conta;

import java.util.ArrayList;
import java.util.List;

public abstract class FiltroDecorator {

    public abstract List<Conta> filtra(List<Conta> contas);
    private FiltroDecorator outroFiltro;

    public  FiltroDecorator (FiltroDecorator outroFiltro){
        this.outroFiltro = outroFiltro;
    }
    public FiltroDecorator (){}

    protected List<Conta> proximo(List<Conta> contas) {
        if(outroFiltro != null) return outroFiltro.filtra(contas);
        else return new ArrayList<Conta>();
    }


}
