public class Main {
    public static void main(String[] args) {

        double nota1 = 5.0;
        double nota2 = 6.0;
        double nota3 = 7.0;
        double nota4 = 8.0;
        double media;

        media = calcularMedia(nota1, nota2, nota3, nota4);

        imprimirMedia(media);

        }
        public static double calcularMedia(double nota1, double nota2, double nota3, double nota4){
        double temp = nota1 + nota2 + nota3 + nota4;
        temp /= 4;
        return temp;
        }
        public static void imprimirMedia(double media){
            System.out.println("A média é: " + media);
        }
}