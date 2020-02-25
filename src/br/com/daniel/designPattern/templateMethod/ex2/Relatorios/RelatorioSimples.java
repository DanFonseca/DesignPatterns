package br.com.daniel.designPattern.templateMethod.ex2.Relatorios;


import br.com.daniel.designPattern.templateMethod.ex2.Conta.Conta;
import br.com.daniel.designPattern.templateMethod.ex2.Templates.TemplateRelatorio;

import java.util.ArrayList;

public class RelatorioSimples extends TemplateRelatorio {


    @Override
    protected void cabecalho(ArrayList<Conta> contas) {
        System.out.println("<cabcalho>");
        for (Conta c: contas) {
            System.out.println(c.getNomeDoBanco());
        }
        System.out.println("</cabcalho>");
    }

    @Override
    protected void rodape(ArrayList<Conta> contas) {
        System.out.println("<rodape>");
        for (Conta c: contas) {
            System.out.println(c.getTelefone());
        }
        System.out.println("</rodape>");
    }

    @Override
    protected void corpo(ArrayList<Conta> contas) {

    }


}
