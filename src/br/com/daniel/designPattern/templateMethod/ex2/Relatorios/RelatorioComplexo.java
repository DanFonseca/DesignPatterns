package br.com.daniel.designPattern.templateMethod.ex2.Relatorios;

import br.com.daniel.designPattern.templateMethod.ex2.Conta.Conta;
import br.com.daniel.designPattern.templateMethod.ex2.Templates.TemplateRelatorio;

import java.util.ArrayList;
import java.util.Date;

public class RelatorioComplexo extends TemplateRelatorio {


    @Override
    protected void cabecalho(ArrayList<Conta> contas) {
        System.out.println("<cabecalho>");
        for (Conta c: contas) {
            System.out.println(c.getNomeDoBanco());
            System.out.println(c.getEndereco());
            System.out.println(c.getTelefone());
        }
        System.out.println("</cabecalho>");
    }

    @Override
    protected void rodape(ArrayList<Conta> contas) {
        Date data = new Date(System.currentTimeMillis());

        System.out.println("<rodape>");
        for (Conta c: contas) {
            System.out.println(c.getTelefone());
            System.out.println(data);
        }
        System.out.println("</rodape>");
    }

    @Override
    protected void corpo(ArrayList<Conta> contas) {

    }


}
