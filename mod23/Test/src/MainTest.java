import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void feminino(){
        var test = new Main();
        List<Pessoa> ganhadoresNobel = new ArrayList<>();
        Main.addPessoas(ganhadoresNobel);
        Stream<Pessoa> listFilter = ganhadoresNobel.stream()
                .filter(pessoa -> pessoa.getGenero().matches("feminino"))
                .sorted(Comparator.comparing(Pessoa::getNome));

        assertTrue(listFilter.allMatch(pessoa -> pessoa.getGenero().equals("feminino")));
    }
}