package br.com.daniel.designPattern.Build;

import java.util.ArrayList;
import java.util.Calendar;

public class NotaFiscal {

    String razaoSocial;
    String CNPJ;
    double valorBruto;
    double impostos;
    Calendar dataEmissao;
    String observacoes;
    ArrayList<ItemNota> itensNota;

    public NotaFiscal(String razaoSocial, String CNPJ, double valorBruto,
                      double impostos, Calendar dataEmissao, String observacoes,
                      ArrayList<ItemNota> itensNota) {

        this.razaoSocial = razaoSocial;
        this.CNPJ = CNPJ;
        this.valorBruto = valorBruto;
        this.impostos = impostos;
        this.dataEmissao = dataEmissao;
        this.observacoes = observacoes;
        this.itensNota = itensNota;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public double getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(double valorBruto) {
        this.valorBruto = valorBruto;
    }

    public double getImpostos() {
        return impostos;
    }

    public void setImpostos(double impostos) {
        this.impostos = impostos;
    }

    public Calendar getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Calendar dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public ArrayList<ItemNota> getItensNota() {
        return itensNota;
    }

    public void setItensNota(ArrayList<ItemNota> itensNota) {
        this.itensNota = itensNota;
    }

}
