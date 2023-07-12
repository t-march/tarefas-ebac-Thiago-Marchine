public class SemContratoFactory extends Factory{
    @Override
    Car buscarCarro(String categoria) {
        if("A".equals(categoria)){
            return new Jetta(500, "Álcool");
        } else if ("B".equals(categoria)) {
            return new Polo(350, "Gasolina");
        } else {
            return null;
        }
    }
}
