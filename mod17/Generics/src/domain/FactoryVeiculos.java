package domain;

import categorias.Hatch;
import categorias.SUV;
import categorias.Sedan;
import generics.GenericVeiculo;

public class FactoryVeiculos {
    public GenericVeiculo getInstance(String categoria, String especificacoes) {
        String[] dados = separarDados(especificacoes);
        if (dados.length != 3) {
            System.out.println("Falha ao cadastrar o veículo, tente novamente");
            return null;
        } else {
            switch (categoria.toLowerCase()) {
                case "hatch" -> {
                    return new Hatch(dados[0], dados[1], dados[2]);
                }
                case "sedan" -> {
                    return new Sedan(dados[0], dados[1], dados[2]);
                }
                case "suv" -> {
                    return new SUV(dados[0], dados[1], dados[2]);
                }
            }

        }
        return null;
    }

    private String[] separarDados(String dados) {
        dados = dados.replaceAll("\\s", "");
        return dados.split(",");
    }
}
