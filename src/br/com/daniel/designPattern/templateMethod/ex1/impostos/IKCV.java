package br.com.daniel.designPattern.templateMethod.ex1.impostos;

import br.com.daniel.designPattern.templateMethod.ex1.classes.Orcamento;
import br.com.daniel.designPattern.templateMethod.ex1.template.TemplateDeImpostoCondicional;

public class IKCV extends TemplateDeImpostoCondicional {
    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500 && orcamento.getValor() > 100;
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.10;
    }

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

}
