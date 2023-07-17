public class Main {
    public static void main(String[] args) {

        Class<?> classeObjeto = ObjetoComAnotacao.class;

        if (classeObjeto.isAnnotationPresent(Tabela.class)) {
            Tabela tabelaAnnotation = classeObjeto.getAnnotation(Tabela.class);
            String nomeTabela = tabelaAnnotation.value();
            System.out.println("Nome da tabela: " + nomeTabela);
        } else {
            System.out.println("A classe não possui a anotação @Tabela.");
        }

    }
    @Tabela("Nome da Tabela")
    public static void teste(){
        System.out.println("Teste");
    }
}