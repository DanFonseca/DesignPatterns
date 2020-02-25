package br.com.daniel.designPattern.templateMethod.ex1.impostos;

import br.com.daniel.designPattern.templateMethod.ex1.classes.Orcamento;
import br.com.daniel.designPattern.templateMethod.ex1.template.TemplateDeImpostoCondicional;

import java.util.ArrayList;

public class IHIT extends TemplateDeImpostoCondicional {

    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        ArrayList <String> item2 = orcamento.getItem();

        String comp = "";
        int count = 0;

        for (int i=0; i < orcamento.getItem().size(); i++){
            comp = item2.get(i);
                for (int j =0; j < orcamento.getItem().size(); j++){
                    if(comp.equals(item2.get(j))){
                        count++;
                    }
                }
        }

        return count > 2;
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() + (orcamento.getValor() * 0.13);
    }

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return 0.1 * orcamento.getItem().size() + (orcamento.getValor());
    }


}
