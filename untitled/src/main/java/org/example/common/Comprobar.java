package org.example.common;

public class Comprobar {
    public static void categoriaOk(int categoria) throws CategoriaException {
       boolean esta= false;
        for (int i = 1; i < 6; i++) {
            if (categoria==i)
                esta=true;
        }
        if (!esta)
            throw new CategoriaException(categoria);

    }
}
