package br.com.daniel.designPattern.State.ex2.Status;

import br.com.daniel.designPattern.State.ex2.Conta;

public class Negativo implements Estado {

    @Override
    public double Saque(double valor) {
         throw new RuntimeException("Não é possível realizar saques. Saldo Negativo");
    }

    @Override
    public double Deposito(double valor) {

        return valor * 0.95;
    }
}
