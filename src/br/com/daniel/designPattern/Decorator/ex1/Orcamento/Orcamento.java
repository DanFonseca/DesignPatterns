package br.com.daniel.designPattern.Decorator.ex1.Orcamento;

import java.util.ArrayList;

public class Orcamento {

    private ArrayList <String>  item = new ArrayList ();
    private double valor;


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


}
