package org.example.domain;

import org.example.common.CategoriaException;

import java.util.List;

import static org.example.common.Comprobar.categoriaOk;

public class Hotel extends Alojamientos{

    private String categoria;

    public Hotel(String nombre, String provincia, int precioHabitacion, List<Double> valoraciones, String categoria) throws CategoriaException {
        super(nombre, provincia, precioHabitacion, valoraciones);
        categoriaOk(categoria);
        this.categoria = categoria;
    }

    public Hotel(String nombre, String provincia, int precioHabitacion, String categoria) throws CategoriaException {
        super(nombre, provincia, precioHabitacion);
        categoriaOk(categoria);
        this.categoria = categoria;
    }
}
