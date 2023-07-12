public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("A", false);
        Factory factory = getFactory(cliente);
        Car carro = factory.criar(cliente.getCategoria());
        carro.ligarMotor();

    }

    private static Factory getFactory(Cliente cliente){
        if(cliente.isEmpresa()){
            return new ContratoFactory();
        } else {
            return new SemContratoFactory();
        }
    }
}