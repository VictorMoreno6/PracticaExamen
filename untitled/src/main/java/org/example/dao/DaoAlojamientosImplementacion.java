package org.example.dao;

import org.example.domain.Alojamiento;

import java.util.List;

public class DaoAlojamientosImplementacion implements DaoAlojamientos{

    public List<Alojamiento> getListaAlojamientos() {
        return null;
    }
    public boolean anyadirAlojamiento(Alojamiento alojamiento) {
        return false;
    }

    public List<Alojamiento> listarAlojamientosProvincia(String provincia, int preciobajo, int precioalto) {
        return null;
    }

    public List<Alojamiento> listarAlojamientosValoracion(String provincia) {
        return null;
    }

    public boolean actualizarCategoria(String nombre, String categoria) {
        return false;
    }
}
