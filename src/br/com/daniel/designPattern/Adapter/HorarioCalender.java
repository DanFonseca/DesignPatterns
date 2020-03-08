package br.com.daniel.designPattern.Adapter;

import java.util.Calendar;

public class HorarioCalender implements Relogio {
    @Override
    public Calendar getHora() {
        Calendar hora = Calendar.getInstance();
        return  hora;
    }
}
