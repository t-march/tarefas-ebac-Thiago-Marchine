package domain;

import generics.GenericVeiculo;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean sair = false;
        Scanner scanner = new Scanner(System.in);
        FactoryVeiculos factory = new FactoryVeiculos();
        List<GenericVeiculo> lista = ListaVeiculos.getInstance();
        GenericVeiculo veiculo;

        do{
            menuPrincipal();
            String opcao = scanner.nextLine().trim();

            if (isOpcaoValida(opcao)) {
                switch (opcao) {
                    case "1":
                        System.out.println("Gostaria de cadastrar um carro de qual categoria?");
                        String categoria = scanner.nextLine().trim();
                        System.out.println("Digite os dados do veículo na seguinte ordem e" +
                                " separados por vírgula, Exemplo: Marca, Modelo, Cor");
                        String especificacoes = scanner.nextLine();
                        veiculo = factory.getInstance(categoria,especificacoes);
                        if (veiculo != null) {
                            lista.add(veiculo);
                            System.out.println("Veículo cadastrado com sucesso!");
                        }
                        break;
                    case "2":
                        excluirCadastro(lista);
                        break;
                    case "3":
                        System.out.println("Digite a categoria a ser listada ou digite todas para listar todos os carros cadastrados");
                        opcao = scanner.nextLine().trim();
                        imprimirVeiculos(lista, opcao);
                        break;
                    case "4":
                        sair = true;
                        break;
                    default:
                        menuPrincipal();
                        break;
                }
            } else {
                System.out.println("Opção inválida");
            }

        } while (!sair);
        scanner.close();


    }


    private static void excluirCadastro(List<GenericVeiculo> lista) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o modelo do veículo a ser excluído:");
        String modelo = scanner.nextLine().trim();

        boolean encontrado = false;
        for (GenericVeiculo veiculo : lista) {
            if (veiculo.getModelo().equalsIgnoreCase(modelo)) {
                lista.remove(veiculo);
                System.out.println("Veículo removido com sucesso!");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Veículo não encontrado.");
        }
    }

    public static void menuPrincipal() {
        System.out.println("Digite a opção desejada: ");
        System.out.println("1 -> Para cadastro");
        System.out.println("2 -> Para excluir");
        System.out.println("3 -> Para listar cadastrados");
        System.out.println("4 -> Para sair");
    }

    public static boolean isOpcaoValida(String opcao) {
        return opcao.equals("1") || opcao.equals("2") || opcao.equals("3") || opcao.equals("4");
    }

    public static void imprimirVeiculos(List<GenericVeiculo> lista, String categoriaSelecionada) {
        System.out.println("Veiculos da categoria " + categoriaSelecionada + ":");

        for (GenericVeiculo veiculo : lista) {
            if (categoriaSelecionada.equalsIgnoreCase(veiculo.getCategoria()) || categoriaSelecionada.equals("todas")) {
                System.out.println("Marca: " + veiculo.getMarca());
                System.out.println("Modelo: " + veiculo.getModelo());
                System.out.println("Cor: " + veiculo.getCor());
                System.out.println("------------------");
            }
        }
    }
}

