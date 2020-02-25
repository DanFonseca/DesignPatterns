package br.com.daniel.designPattern.templateMethod.ex1.template;

import br.com.daniel.designPattern.templateMethod.ex1.interfaces.Imposto;
import  br.com.daniel.designPattern.templateMethod.ex1.classes.Orcamento;

public abstract class TemplateDeImpostoCondicional implements Imposto {

    public double calcula (Orcamento orcamento){

       if (deveUsarMaximaTaxacao(orcamento)){
           return maximaTaxacao(orcamento);
       }else {
           return minimaTaxacao(orcamento);
       }

    }

    protected abstract boolean deveUsarMaximaTaxacao (Orcamento orcamento);
    protected abstract double maximaTaxacao (Orcamento orcamento);
    protected  abstract double minimaTaxacao (Orcamento orcamento);
}
