package domain;

import generics.GenericVeiculo;

import java.util.ArrayList;
import java.util.List;

public class ListaVeiculos {
    private static List<GenericVeiculo> listaVeiculos;

    private ListaVeiculos() {
        listaVeiculos = new ArrayList<>();
    }

    public static List<GenericVeiculo> getInstance() {
        if (listaVeiculos == null) {
            {
                new ListaVeiculos();
            }

        }
        return listaVeiculos;
    }
}