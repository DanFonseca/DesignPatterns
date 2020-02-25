package br.com.daniel.designPattern.Decorator.ex1.Impostos;

import br.com.daniel.designPattern.Decorator.ex1.Orcamento.Orcamento;

public class ICMS extends Imposto {

    public ICMS (Imposto outroImposto){
        super(outroImposto);
    }
    public ICMS (){
        super();
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return  orcamento.getValor() * 0.15 + (calculaOutroImposto(orcamento));
    }
}
