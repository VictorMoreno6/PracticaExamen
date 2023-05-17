package org.example.common;

import java.util.Arrays;

public class CategoriaException extends Exception {
    public CategoriaException(int categoria) {
        super("La categoria " + categoria + " no esta permitida. Solo son válidas las siguientes categorías:" + Arrays.toString(Categoria.values()));
    }
}
