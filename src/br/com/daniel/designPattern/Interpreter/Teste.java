package br.com.daniel.designPattern.Interpreter;

public class Teste {
    public static void main(String[] args) {
        Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
        Expressao direita = new Soma(new Numero(2), new Numero(10));

        Expressao conta = new Soma(esquerda, direita);
        Expressao novaConta = new Multiplicacao(conta, conta);

        int resultado = novaConta.avalia();


        System.out.println(resultado);


        Expressao unicoNumero = new RaizQuadrada(new Numero(50));

        int resultado2 = unicoNumero.avalia();

        System.out.println(resultado2);

        Impressora visitor = new Impressora();
        conta.aceita(visitor);
    }
}
