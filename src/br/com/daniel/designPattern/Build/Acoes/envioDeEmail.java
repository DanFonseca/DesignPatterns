package br.com.daniel.designPattern.Build.Acoes;

public class envioDeEmail implements AcoesAposGeracaoNF {
    @Override
    public void executa() {
        System.out.println("Enviando E-mail...");
    }
}
