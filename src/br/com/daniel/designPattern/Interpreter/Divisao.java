package br.com.daniel.designPattern.Interpreter;

public class Divisao implements Expressao {
    private Expressao direita;
    private Expressao esquerda;

    public Divisao (Expressao direita, Expressao esquerda){
        this.direita = direita;
        this.esquerda = esquerda;
    }

    @Override
    public int avalia() {
        int avaliaResultadoEsquerda =  esquerda.avalia();
        int avaliaResultadoDireita = direita.avalia();

        return avaliaResultadoEsquerda / avaliaResultadoDireita;
    }

    @Override
    public void aceita(Impressora visitor) {

    }
}
