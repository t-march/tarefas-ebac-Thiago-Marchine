import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double media;
        media = calcMedia();
        resultFinal(media);

    }
    private static double calcMedia(){
        Scanner scanner = new Scanner(System.in);
        double media;
        System.out.println("Insira a nota referente ao primeiro trimestre do aluno: ");
        media = scanner.nextDouble();
        System.out.println("Insira a nota referente ao segundo trimestre do aluno: ");
        media += scanner.nextDouble();
        System.out.println("Insira a nota referente ao terceiro trimestre do aluno: ");
        media += scanner.nextDouble();
        System.out.println("Insira a nota referente ao quarto trimestre do aluno: ");
        media += scanner.nextDouble();
        return media/4;
    }
    private static void resultFinal(double media){
        if (media >= 7){
            System.out.println("A média final do aluno foi de : " + media + ", ele está aprovado.");
        } else if (media >= 5) {
            System.out.println("A média final do aluno foi de : " + media + ", ele está de recuperação.");
        } else {
            System.out.println("A média final do aluno foi de : " + media + ", ele foi reprovado.");
        }
    }
}