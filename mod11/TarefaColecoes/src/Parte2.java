import java.util.*;

// Davi - H,Beto - H,Carol - M,Amanda - M,Fatima - M,Edson - H

public class Parte2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String listaNomes;

        System.out.println("Digite o nome separado do sexo por hífen " +
                "e separado do próximo nome por vírgula. Exemplo: Nome - H, Nome - M");
        listaNomes = scanner.nextLine();
        String[] arrayNomes = listaNomes.split(",");

        organizarPorGenero(arrayNomes);

    }
    public static void imprimirLista(List<String> listaNomes){
        Collections.sort(listaNomes);
        for (String nomes : listaNomes) {
            System.out.println(nomes);
        }
    }
    public static void organizarPorGenero(String[] arrayNomes){
        String[] temp;
        List<String> listaHomens = new ArrayList<>();
        List<String> listaMulheres = new ArrayList<>();
        for (int i = 0; i < arrayNomes.length; i++) {
            temp = arrayNomes[i].split("-");
            if(temp[1].contains("M")){
                listaMulheres.add(temp[0]);
            } else if (temp[1].contains("H")) {
                listaHomens.add(temp[0]);
            } else {
                System.out.println("Rode novamente o programa digitando as instruções corretamente.");
            }
        }
        System.out.println("Homens:");
        imprimirLista(listaHomens);
        System.out.println("Mulheres:");
        imprimirLista(listaMulheres);
    }
}
