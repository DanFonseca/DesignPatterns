package br.com.daniel.designPattern.State.ex1;

import br.com.daniel.designPattern.State.ex1.Interface.Estado;

import java.util.ArrayList;

public class Orcamento {

    private ArrayList <String>  item = new ArrayList ();
    private double valor;
    public Estado estado;

    public Orcamento (){
        this.estado = new EmAprovacao();
    }

    public ArrayList<String> getItem() {
        return item;
    }

    public void setItem(String nome) {
        this.item.add(nome);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void aplicarDesconto (){
        this.valor -= estado.calcular(this);
   }


   public void aprovado (){
        this.estado.aprovado(this);
   }

    public void emAprovacao (){
        this.estado.emAprovacao(this);
    }

    public void reprovado() {
        this.estado.reprovado(this);
    }

    public void finalizado() {
        estado.finalizado(this);
    }
}
