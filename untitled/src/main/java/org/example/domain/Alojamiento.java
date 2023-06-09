package org.example.domain;


import java.io.Serializable;
import java.util.List;

public abstract class Alojamiento implements Serializable, Comparable<Alojamiento> {

    protected String nombre;
    protected String provincia;
    protected double precioHabitacion;
    protected List<Integer> valoraciones;

    public Alojamiento(String nombre, String provincia, double precioHabitacion, List<Integer> valoraciones) {
        this.nombre = nombre;
        this.provincia = provincia;
        this.precioHabitacion = precioHabitacion;
        this.valoraciones = valoraciones;
    }

}
