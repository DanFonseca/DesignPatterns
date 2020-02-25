package br.com.daniel.designPattern.State.ex1;

import br.com.daniel.designPattern.State.ex1.Interface.Estado;

public class Reprovado implements Estado {
    @Override
    public double calcular(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void aprovado(Orcamento orcamento) {
        throw new RuntimeException("Não é possível alterar para Aprovado. Pois já está como Reprovado");
    }


    @Override
    public void emAprovacao(Orcamento orcamento) {
        throw new RuntimeException("Não é possível alterar para Em Aprovação. Pois já está como Reprovado");
    }

    @Override
    public void finalizado(Orcamento orcamento) {
        orcamento.finalizado();
    }

    @Override
    public void reprovado(Orcamento orcamento) {
         throw new RuntimeException("Não é possível alterar para Reprovado. Pois já está como Reprovado");
    }

    public String toString() {
        return "Reprovado";
    }
}
