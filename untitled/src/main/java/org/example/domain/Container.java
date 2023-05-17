package org.example.domain;

import org.example.common.CategoriaException;

import java.util.List;

public class Container {
    private List<Alojamientos> alojamientos;

    public Container(List<Alojamientos> alojamientos) {
        this.alojamientos = alojamientos;
    }

    public Container() {
        try {
            alojamientos.add(new Hotel("Hotel1", "Sevilla", 50, "tres"));
        } catch (CategoriaException e) {
            throw new RuntimeException(e);
        }

    }
}
