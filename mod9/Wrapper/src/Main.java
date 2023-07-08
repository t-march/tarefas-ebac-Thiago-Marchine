public class Main {
    public static void main(String[] args) {

        String entradaConsole = args[0];
        int numPrimitive = Integer.parseInt(entradaConsole);
        Integer numWrapper = (Integer) numPrimitive;

        System.out.println(numWrapper);

    }
}