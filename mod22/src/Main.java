import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List <Pessoa> ganhadoresNobel = new ArrayList<>();

        addPessoas(ganhadoresNobel);

        Stream<Pessoa> listFilter = ganhadoresNobel.stream()
                .filter(pessoa -> pessoa.getGenero().matches("feminino"))
                .sorted(Comparator.comparing(Pessoa::getNome));

        listFilter.forEach(System.out::println);

    }

    public static void addPessoas (List list){
        list.add(new Pessoa("Andrea Ghez", "feminino"));
        list.add(new Pessoa("Emmanuelle Charpentier", "feminino"));
        list.add(new Pessoa("Jennifer Doudna", "feminino"));
        list.add(new Pessoa("Louise Glück", "feminino"));
        list.add(new Pessoa("Maria Ressa", "feminino"));
        list.add(new Pessoa("Carolyn Bertozzi", "feminino"));
        list.add(new Pessoa("Annie Ernaux", "feminino"));
        list.add(new Pessoa("Roger Penrose", "masculino"));
        list.add(new Pessoa("Reinhard Genzel", "masculino"));
        list.add(new Pessoa("Harvey J. Alter", "masculino"));
        list.add(new Pessoa("Michael Houghton", "masculino"));
        list.add(new Pessoa("Charles M. Rice", "masculino"));
        list.add(new Pessoa("Syukuro Manabe", "masculino"));
    }
}
