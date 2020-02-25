package br.com.daniel.designPattern.State.ex1;

public class Teste {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();

        orcamento.setValor(600);
        orcamento.setItem("tv");
        orcamento.setItem("bicicleta");
        orcamento.setItem("Notebook");
        orcamento.setItem("Carrinho de controle remoto");
        orcamento.setItem("iPhone 11");
        orcamento.setItem("Copo Termico");

        orcamento.aplicarDesconto();
        orcamento.aplicarDesconto();
        System.out.println(orcamento.getValor());


    }
}
