import java.util.Arrays;
import java.util.Scanner;

public class Parte1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String listaNomes;

        System.out.println("Digite os nomes separados por vírgula.");
        listaNomes = scanner.nextLine();
        String[] arrayNomes = listaNomes.split(",");
        Arrays.sort(arrayNomes);
        System.out.println(Arrays.toString(arrayNomes));
        System.out.println("**********");
        imprimirArray(arrayNomes);
    }
    public static void imprimirArray(String[] arrayNomes){
        for (String nomes : arrayNomes) {
            System.out.println(nomes);
        }
    }
}
