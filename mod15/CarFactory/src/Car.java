public abstract class Car {

    private int potencia;
    private String combustivel;
    private String cor;

    public Car(int potencia, String combustivel, String cor) {
        this.potencia = potencia;
        this.combustivel = combustivel;
        this.cor = cor;
    }

    public void ligarMotor(){
        System.out.println("O motor a " + combustivel + " está em funcionamento, potência estimada de: " + potencia);
    }

    public void limpar(){
        System.out.println("O carro foi limpo, sua cor " + cor + " está brilhando");
    }

    public void checagemMecanic(){
        System.out.println("O carro foi checado pelo mecânico, tudo em ordem");
    }

    public void abastecer(){
        System.out.println("O tanque foi completado com " + combustivel.toLowerCase());
    }

    public void carroEscolhido(){
        System.out.println("Seu " + getClass().getSimpleName() + " está a caminho, aguarde um momento");
    }
}
