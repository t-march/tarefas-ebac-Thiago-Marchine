public class Main {
    public static void main(String[] args) {

        PessoaFisica teste = new PessoaFisica("Thiago", "123.456.789-10", "06/03/1989");
        teste.setEndereco("Rua 1, Cep 12345-678");

        PessoaJuridica empresaTeste = new PessoaJuridica("Empresa Teste", "12.345.678/0001-99",
                "10/07/2023", teste);
        empresaTeste.setEndereco("Rua 2, Cep 12345-678");

        empresaTeste.imprimirDados();


    }

}
