package br.com.daniel.designPattern.State.ex2;


import br.com.daniel.designPattern.State.ex2.Status.Estado;
import br.com.daniel.designPattern.State.ex2.Status.Negativo;
import br.com.daniel.designPattern.State.ex2.Status.Positivo;

public class Conta {

    private double saldo;
    private String titular;
    protected Estado estadoDaConta;

    public Conta(double saldo, String titular){
        this.saldo = saldo;
        this.titular = titular;
        verificaStatus(this.saldo);
    }

    public void verificaStatus (double saldo){
        if (saldo < 0){
            estadoDaConta = new Negativo();
        }else {
            estadoDaConta = new Positivo();
        }
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar (double valor){
        this.saldo += estadoDaConta.Deposito(valor);
        verificaStatus(this.saldo);
    }
    public void saque (double valor){
        this.saldo -= estadoDaConta.Saque(valor);
        verificaStatus(this.saldo);
    }




}
