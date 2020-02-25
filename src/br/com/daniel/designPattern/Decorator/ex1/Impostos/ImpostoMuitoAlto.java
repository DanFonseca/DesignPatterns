package br.com.daniel.designPattern.Decorator.ex1.Impostos;

import br.com.daniel.designPattern.Decorator.ex1.Orcamento.Orcamento;

public class ImpostoMuitoAlto extends Imposto {

    public ImpostoMuitoAlto (Imposto outroImposto){
        super(outroImposto);
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.20 + calculaOutroImposto(orcamento);
    }
}
