package br.com.daniel.designPattern.Interpreter;

public class Numero implements Expressao {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public Numero (int numero){
        this.numero = numero;
    }

    @Override
    public int avalia() {

        return numero;
    }

    @Override
    public void aceita(Impressora visitor) {
        visitor.visitaNumero(this);
    }
}
