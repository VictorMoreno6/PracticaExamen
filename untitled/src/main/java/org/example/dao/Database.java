package org.example.dao;

import org.example.common.CategoriaException;
import org.example.domain.Alojamiento;
import org.example.domain.CasaRural;
import org.example.domain.Hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Database {


    private final ArrayList<Alojamiento> alojamientos;

    public Database() {
        this.alojamientos = new ArrayList<>();

        try {
            alojamientos.add(new Hotel("Mario", "Madrid", 45, new ArrayList<>(), 5));
            alojamientos.add(new Hotel("David", "Murcia", 30, new ArrayList<>(), 3));
            alojamientos.add(new Hotel("Carlota", "Madrid", 63, new ArrayList<>(), 4));
        } catch (CategoriaException e) {
            throw new RuntimeException(e);
        }
        alojamientos.add(new CasaRural("Miguel", "Valencia", 20, new ArrayList<>(), true));
        alojamientos.add(new CasaRural("Jose", "Valencia", 35, new ArrayList<Integer>(), false));
        alojamientos.add(new CasaRural("Jorge", "Madrid", 25, new ArrayList<>(), false));
        alojamientos.add(new CasaRural("Ahmed", "Santiago", 12, new ArrayList<>(), true));

    }

    public Database (ArrayList<Alojamiento> alojamientos){
        this.alojamientos = alojamientos;
    }

    public List<Alojamiento> getListaAlojamientos() {
        return alojamientos;
    }


    public void setListaAlojamientos(List<Alojamiento> alojamientos) {
        this.alojamientos.clear();
        this.alojamientos.addAll(alojamientos);
    }
}


