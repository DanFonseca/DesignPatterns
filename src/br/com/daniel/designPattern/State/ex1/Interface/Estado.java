package br.com.daniel.designPattern.State.ex1.Interface;

import br.com.daniel.designPattern.State.ex1.Orcamento;

public interface Estado {

    public double calcular (Orcamento orcamento);
    void aprovado(Orcamento orcamento);
    void emAprovacao (Orcamento orcamento);
    void finalizado (Orcamento orcamento);
    void reprovado (Orcamento orcamento);
    String toString ();


}
