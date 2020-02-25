package br.com.daniel.designPattern.Decorator.ex1.Impostos;

import br.com.daniel.designPattern.Decorator.ex1.Orcamento.Orcamento;

public class IPVA extends Imposto {

    public IPVA (Imposto outroImposto){
        super(outroImposto);
    }
    public IPVA () {
        super();
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.2 + calculaOutroImposto(orcamento);
    }
}
