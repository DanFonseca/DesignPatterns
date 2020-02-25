package br.com.daniel.designPattern.Build.Acoes;

import br.com.daniel.designPattern.Build.BuildNF;

public class Multiplicador implements AcoesAposGeracaoNF {
    @Override
    public void executa() {}

    public double multiplicador (double valor){
        return valor;
    }
}
