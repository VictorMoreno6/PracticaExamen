package org.example.domain;

import org.example.common.CategoriaException;

import java.util.List;

import static org.example.common.Comprobar.categoriaOk;

public class Hotel extends Alojamiento {

    private int categoria;

    public Hotel(String nombre, String provincia, int precioHabitacion, List<Integer> valoraciones, int categoria) throws CategoriaException {
        super(nombre, provincia, precioHabitacion, valoraciones);
        categoriaOk(categoria);
        this.categoria = categoria;
    }

    @Override
    public int compareTo(Alojamiento o) {
        return 0;
    }
}
