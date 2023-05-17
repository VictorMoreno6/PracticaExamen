package org.example.domain;

import lombok.Data;

import java.util.List;

@Data
public abstract class Alojamientos {

    protected String nombre;
    protected String provincia;
    protected int precioHabitacion;
    protected List<Double> valoraciones; //List<Integer>

    public Alojamientos(String nombre, String provincia, int precioHabitacion, List<Double> valoraciones) {
        this.nombre = nombre;
        this.provincia = provincia;
        this.precioHabitacion = precioHabitacion;
        this.valoraciones = valoraciones;
    }
    public Alojamientos(String nombre, String provincia, int precioHabitacion) {
        this.nombre = nombre;
        this.provincia = provincia;
        this.precioHabitacion = precioHabitacion;
    }
}
