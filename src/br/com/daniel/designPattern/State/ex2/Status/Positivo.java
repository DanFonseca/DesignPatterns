package br.com.daniel.designPattern.State.ex2.Status;

public class Positivo implements Estado {

    @Override
    public double Saque(double valor) {
        return valor;
    }

    @Override
    public double Deposito(double valor) {
        return valor + (valor*0.98);
    }
}
