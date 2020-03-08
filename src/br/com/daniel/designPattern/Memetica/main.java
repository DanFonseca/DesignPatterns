package br.com.daniel.designPattern.Memetica;

import java.util.Calendar;

public class main {

    public static void main(String[] args) {
        Historico historico = new Historico();
        Contrato contrato = new Contrato(Calendar.getInstance(), "Jorge",  TipoContrato.NOVO);
        historico.guardaEstado(contrato.salvaEstado());

        Estado estado = new Estado(contrato);

        System.out.println(historico.pegaHistorico(0));
    }
}
