package br.com.daniel.designPattern.Build.Acoes;

public class NFDAO implements AcoesAposGeracaoNF {
    @Override
    public void executa() {
        System.out.println("Salvando no Banco de Dados...");
    }
}
