package br.com.daniel.designPattern.Memetica;

import java.util.Calendar;

public class Contrato {
    private Calendar data;
    private String cliente;
    private TipoContrato tipo;

    public Contrato(Calendar data, String cliente, TipoContrato tipo) {
        this.data = data;
        this.cliente = cliente;
        this.tipo = tipo;
    }

    public Estado salvaEstado(){
        return new Estado (new Contrato(data, cliente, tipo));
    }
}
