package br.com.daniel.designPattern.State.ex2;

public class Teste {

    public static void main(String[] args) {
        Conta conta = new Conta (1, "Daniel");
        conta.saque(10);

        System.out.println(conta.getSaldo());
    }
}
