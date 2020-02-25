package br.com.daniel.designPattern.Decorator.ex1.Impostos;

import br.com.daniel.designPattern.Decorator.ex1.Orcamento.Orcamento;

public class IPTU extends Imposto {

    public IPTU (Imposto outroImposto){
        super(outroImposto);
    }
    public IPTU(){
        super();
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor()* 0.25 + calculaOutroImposto(orcamento);
    }
}
