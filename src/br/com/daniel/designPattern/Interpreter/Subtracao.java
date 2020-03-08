package br.com.daniel.designPattern.Interpreter;

public class Subtracao implements Expressao {
    private Expressao esquerda;
    private Expressao direita;

    public Expressao getEsquerda() {
        return esquerda;
    }

    public Expressao getDireita() {
        return direita;
    }

    public Subtracao (Expressao esquerda, Expressao direita){
        this.direita = direita;
        this.esquerda = esquerda;
    }


    @Override
    public int avalia() {
        int resultadoDaEsquerda = esquerda.avalia();
        int resultadoDaDireita = direita.avalia();

        return resultadoDaEsquerda  - resultadoDaDireita;
    }

    @Override
    public void aceita(Impressora visitor) {
        visitor.visitaSubtracao(this);
    }
}
