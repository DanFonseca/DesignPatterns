package br.com.daniel.designPattern.templateMethod.ex2.Templates;
import br.com.daniel.designPattern.templateMethod.ex2.Conta.Conta;
import java.util.ArrayList;


public abstract class TemplateRelatorio  {

    protected abstract void cabecalho(ArrayList<Conta> contas);
    protected abstract void rodape (ArrayList<Conta> contas);
    protected abstract void corpo(ArrayList<Conta> contas);
    protected  ArrayList<Conta> contas;

    public final void  gerarRelatorio (ArrayList<Conta> contas){
        cabecalho(contas);
        rodape(contas);
        corpo(contas);
    }

}
