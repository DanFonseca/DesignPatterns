package br.com.daniel.designPattern.templateMethod.ex1.impostos;

import br.com.daniel.designPattern.templateMethod.ex1.classes.Orcamento;
import br.com.daniel.designPattern.templateMethod.ex1.template.TemplateDeImpostoCondicional;

public class ICPP extends TemplateDeImpostoCondicional {
    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() >= 500;
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }
}
