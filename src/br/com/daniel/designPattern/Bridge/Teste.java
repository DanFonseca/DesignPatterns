package br.com.daniel.designPattern.Bridge;

public class Teste {

    public static void main(String[] args) {
        Mapa googleMaps = new GoogleMaps();

        googleMaps.pegaMapa("Av Paulista");
    }


}
