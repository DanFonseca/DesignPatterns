package br.com.daniel.designPattern.templateMethod.ex1.classes;

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

    public boolean existeOItem (String nome){
        return  item.stream().anyMatch(s -> s.equals(nome));
    }




}
