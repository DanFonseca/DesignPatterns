package br.com.daniel.designPattern.Decorator.ex1.Impostos;

import br.com.daniel.designPattern.Decorator.ex1.Orcamento.Orcamento;

public abstract class Imposto {

    private Imposto outroImposto;


    public Imposto (Imposto outroImposto){
        this.outroImposto = outroImposto;
    }

    public Imposto(){
        outroImposto = null;
    }


    protected double calculaOutroImposto(Orcamento orcamento) {
        return (outroImposto == null? 0 : outroImposto.calcula(orcamento));
    }

    public abstract double calcula(Orcamento orcamento);


}
