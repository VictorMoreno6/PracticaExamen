package org.example.domain;


import java.io.Serializable;
import java.util.List;

public class CasaRural extends Alojamiento implements Serializable{

    private boolean piscina;

    public CasaRural(String nombre, String provincia, double precioHabitacion, List<Integer> valoraciones, boolean piscina) {
        super(nombre, provincia, precioHabitacion, valoraciones);
        this.piscina = piscina;
    }

    @Override
    public int compareTo(Alojamiento o) {
        return 0;
    }
}
