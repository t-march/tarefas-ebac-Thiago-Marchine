public abstract class Factory {

    public Car criar(String categoria){
        Car carro = buscarCarro(categoria);
        carro = prepararCarro(carro);
        return carro;
    }

    private Car prepararCarro(Car carro) {
        carro.carroEscolhido();
        carro.limpar();
        carro.checagemMecanic();
        carro.abastecer();
        return carro;
    }

    abstract Car buscarCarro(String categoria);
}
