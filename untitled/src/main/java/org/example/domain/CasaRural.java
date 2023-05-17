package org.example.domain;

import java.util.List;

public class CasaRural extends Alojamientos{

    private boolean piscina;

    public CasaRural(String nombre, String provincia, int precioHabitacion, List<Double> valoraciones, boolean piscina) {
        super(nombre, provincia, precioHabitacion, valoraciones);
        this.piscina = piscina;
    }

    public CasaRural(String nombre, String provincia, int precioHabitacion, boolean piscina) {
        super(nombre, provincia, precioHabitacion);
        this.piscina = piscina;
    }
}
