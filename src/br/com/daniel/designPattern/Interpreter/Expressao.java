package br.com.daniel.designPattern.Interpreter;

public interface Expressao {
    int avalia();
    void aceita(Impressora visitor);

}
