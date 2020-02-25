package br.com.daniel.designPattern.Decorator.ex1.Classes;

import br.com.daniel.designPattern.Decorator.ex1.Impostos.ICMS;
import br.com.daniel.designPattern.Decorator.ex1.Impostos.IPVA;
import br.com.daniel.designPattern.Decorator.ex1.Impostos.Imposto;
import br.com.daniel.designPattern.Decorator.ex1.Orcamento.Orcamento;


public class Teste {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.setItem("TV");
        orcamento.setValor(100);


        Imposto ICMS = new ICMS();
        Imposto IPVA = new IPVA(ICMS);
        IPVA.calcula(orcamento);
        System.out.println();

    }
}
