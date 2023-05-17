package org.example.common;

public class Comprobar {
    public static void categoriaOk(String categoria) throws CategoriaException {
       boolean esta= false;
       Categoria aux[] = Categoria.values();
        for (int i = 0; i < aux.length; i++) {
            if (aux[i].toString().equalsIgnoreCase(categoria))
                esta=true;
        }
        if (!esta)
            throw new CategoriaException(categoria);

    }
}
