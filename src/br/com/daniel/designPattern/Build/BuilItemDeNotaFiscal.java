package br.com.daniel.designPattern.Build;

public class BuilItemDeNotaFiscal {

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    private String descricao;
    private  double valor;


    public BuilItemDeNotaFiscal  setValor(double valor) {
        this.valor = valor;

        return  this;
    }

    public ItemNota build (){
        return new ItemNota(descricao, valor);
    }


}
