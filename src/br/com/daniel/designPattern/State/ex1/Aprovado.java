package br.com.daniel.designPattern.State.ex1;

import br.com.daniel.designPattern.State.ex1.Interface.Estado;

public class Aprovado implements Estado {


    @Override
    public double calcular(Orcamento orcamento) {
        return orcamento.getValor() * 0.2;
    }

    @Override
    public void aprovado(Orcamento orcamento) {
        throw new RuntimeException("Status já está como Aprovado.");
    }


    @Override
    public void emAprovacao(Orcamento orcamento) {
        throw new RuntimeException("Status não pode ser alterado para Em Aprovação. Pois está Aprovado");
    }

    @Override
    public void finalizado(Orcamento orcamento) {
        orcamento.estado = new Finalizado();
    }

    @Override
    public void reprovado(Orcamento orcamento) {
        throw new RuntimeException("Status não pode ser alterado para Reprovado. Pois está Aprovado");
    }

    public String toString (){
        return "Aprovado";
    }
}
