package br.com.daniel.designPattern.Decorator.ex2.Filtro;

import br.com.daniel.designPattern.Decorator.ex2.Classes.Conta;
import br.com.daniel.designPattern.Decorator.ex2.Decorator.FiltroDecorator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FiltroMenor100Reais extends FiltroDecorator {

    public FiltroMenor100Reais (FiltroDecorator outroFiltro){
        super(outroFiltro);
    }

    public FiltroMenor100Reais() {
        super();
    }

    public ArrayList<Conta> doFilter (ArrayList<Conta> contas){
        ArrayList<Conta> contasFiltradas = new ArrayList<>();

        for (Conta conta: contas) {
            if(conta.getSaldo() < 100){
                contasFiltradas.add(conta);
            }
        }
        contasFiltradas.addAll(proximo(contas));

        return contasFiltradas;
    }

    @Override
    public List<Conta> filtra(List<Conta> contas) {
        return null;
    }
}
