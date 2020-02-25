package br.com.daniel.designPattern.templateMethod.ex1;

import br.com.daniel.designPattern.templateMethod.ex1.impostos.ICPP;
import br.com.daniel.designPattern.templateMethod.ex1.classes.Orcamento;
import br.com.daniel.designPattern.templateMethod.ex1.impostos.IHIT;

public class main {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();

        orcamento.setValor(100);
        orcamento.setItem("TV");
        orcamento.setItem("Karaoke");


        IHIT icpp = new IHIT();
        double valor = icpp.calcula(orcamento);
        System.out.println(valor);


        }
    }

