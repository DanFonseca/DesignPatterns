package br.com.daniel.designPattern.Interpreter;

public class Soma implements Expressao{
    private Expressao esquerda;
    private Expressao direita;

    public Soma (Expressao esquerda, Expressao direita){
        this.direita = direita;
        this.esquerda = esquerda;
    }

    public Expressao getEsquerda() {
        return esquerda;
    }

    public Expressao getDireita() {
        return direita;
    }

    @Override
    public int avalia() {
        int resultadoDaEsquerda = esquerda.avalia();
        int resultadoDaDireita = direita.avalia();
        return resultadoDaEsquerda + resultadoDaDireita;
    }

    @Override
    public void aceita(Impressora visitor) {
        visitor.visitaSoma(this);
    }
}
