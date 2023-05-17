package org.example.dao;

import org.example.domain.Alojamiento;

import java.util.List;

public interface DaoAlojamientos {

    List<Alojamiento> getListaAlojamientos();
    boolean anyadirAlojamiento(Alojamiento alojamiento);

    List<Alojamiento> listarAlojamientosProvincia(String provincia, int preciobajo, int precioalto);

    List<Alojamiento> listarAlojamientosValoracion(String provincia);

    boolean actualizarCategoria(String nombre, String categoria);
}
