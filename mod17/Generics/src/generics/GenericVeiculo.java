package generics;

import java.util.Objects;

public abstract class GenericVeiculo {
    String categoria;
    String marca;
    String modelo;
    String cor;

    public GenericVeiculo(String categoria, String marca, String modelo, String cor) {
        this.categoria = categoria;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }
    public String getCategoria() {
        return categoria;
    }
    public String getCor() {
        return cor;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenericVeiculo that = (GenericVeiculo) o;
        return Objects.equals(categoria, that.categoria) && Objects.equals(marca, that.marca) && Objects.equals(modelo, that.modelo) && Objects.equals(cor, that.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoria, marca, modelo, cor);
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", modelo: " + modelo + ", cor: " + cor;
    }
}

