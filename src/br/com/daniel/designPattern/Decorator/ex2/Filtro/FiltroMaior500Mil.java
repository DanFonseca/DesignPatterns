package br.com.daniel.designPattern.Decorator.ex2.Filtro;

import br.com.daniel.designPattern.Decorator.ex2.Classes.Conta;

import java.util.ArrayList;

public class FiltroMaior500Mil {

    private ArrayList<Conta> contasFiltradas = new ArrayList<Conta>();

    public ArrayList<Conta> doFilter (ArrayList<Conta> contas){
        for (Conta conta: contas) {
            if(conta.getSaldo() > 500000){
                contasFiltradas.add(conta);
            }
        }

        return contasFiltradas;
    }
}
