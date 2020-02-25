package br.com.daniel.designPattern.State.ex1;

import br.com.daniel.designPattern.State.ex1.Interface.Estado;

public class Finalizado  implements Estado {

    @Override
    public double calcular(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void aprovado(Orcamento orcamento) {
        throw new RuntimeException("Status não pode ser alterado para Aprovado. Pois está Finalizado");
    }


    @Override
    public void emAprovacao(Orcamento orcamento) {
        throw new RuntimeException("Status não pode ser alterado para Em Aprovação. Pois está Finalizado");

    }

    @Override
    public void finalizado(Orcamento orcamento) {
        throw new RuntimeException("Status não pode ser alterado para Reprovado. Pois está Finalizado");
    }

    @Override
    public void reprovado(Orcamento orcamento) {
        throw new RuntimeException("Status não pode ser alterado para Reprovado. Pois está Finalizado");
    }

    @Override
    public String toString() {
        return "Finalizado";
    }
}
