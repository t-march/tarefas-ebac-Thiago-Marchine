public class ContratoFactory extends Factory{
    @Override
    Car buscarCarro(String categoria) {
        if("A".equals(categoria)){
            return new Mercedes(500, "Gasolina","Preto");
        } else if ("B".equals(categoria)) {
            return new Audi(350, "Gasolina", "Preto");
        } else {
            return null;
        }
    }
}
