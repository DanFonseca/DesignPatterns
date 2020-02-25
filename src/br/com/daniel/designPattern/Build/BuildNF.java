package br.com.daniel.designPattern.Build;

import br.com.daniel.designPattern.Build.Acoes.AcoesAposGeracaoNF;
import br.com.daniel.designPattern.Build.Acoes.Multiplicador;

import java.util.ArrayList;
import java.util.Calendar;

public class BuildNF {
    private String razaoSocial;
    private String CNPJ;
    private double valorBruto;
    private double impostos;
    private Calendar dataEmissao = Calendar.getInstance();
    private String observacoes;
    private ArrayList <ItemNota> itens = new ArrayList<>();

    private ArrayList<AcoesAposGeracaoNF> acoesAposGeracaoNFS = new ArrayList<>();

    public ArrayList<ItemNota> getItens() {
        return itens;
    }


    public BuildNF(ArrayList<AcoesAposGeracaoNF> acoesAposGeracaoNFS) {
        this.acoesAposGeracaoNFS = acoesAposGeracaoNFS;
    }

    public BuildNF setItens(ItemNota item) {
        this.valorBruto =+ item.getValor();
        impostos += item.getValor() * 0.5;

        this.itens.add(item);

        return this;
    }


    public BuildNF setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;

        return this;
    }

    public BuildNF setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;

        return this;
    }

    public BuildNF setValorBruto(double valorBruto) {
        this.valorBruto = valorBruto;

        return  this;
    }

    public BuildNF setImpostos(double impostos) {
        this.impostos = impostos;

        return this;
    }

    public BuildNF setDataEmissao(Calendar novaData) {
        this.dataEmissao = dataEmissao;

        return this;
    }

    public BuildNF setObservacoes(String observacoes) {
        this.observacoes = observacoes;

        return this;
    }

    public NotaFiscal buildNF () {

        for (AcoesAposGeracaoNF acao: this.acoesAposGeracaoNFS) {
            acao.executa();
        }
        this.valorBruto *= new Multiplicador().multiplicador(50);
        return  new NotaFiscal(razaoSocial,CNPJ,valorBruto,impostos,dataEmissao,observacoes, itens);
    }
}
