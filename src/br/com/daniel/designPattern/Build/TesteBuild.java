package br.com.daniel.designPattern.Build;

import br.com.daniel.designPattern.Build.Acoes.*;

import java.util.ArrayList;
import java.util.Calendar;

public class TesteBuild {

    public static void main(String[] args) {
        Calendar rightNow = Calendar.getInstance();
        ArrayList<AcoesAposGeracaoNF> acoes = new ArrayList<AcoesAposGeracaoNF>();

        acoes.add(new envioDeEmail());
        acoes.add(new SalvarNoSAP());

        BuildNF buildNF = new BuildNF(acoes);
        BuilItemDeNotaFiscal builItemDeNotaFiscal = new BuilItemDeNotaFiscal();

        builItemDeNotaFiscal.
                setValor(100)
                .setDescricao("TV");


        NotaFiscal NF =      buildNF.setCNPJ("26654799")
                .setItens(builItemDeNotaFiscal.build())
                .setDataEmissao(rightNow)
                .setRazaoSocial("aaaaaa").buildNF();

        System.out.println(NF.getDataEmissao());
    }

}
