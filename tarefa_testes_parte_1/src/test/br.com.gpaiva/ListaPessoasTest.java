import br.com.gpaiva.ListaPessoas;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ListaPessoasTest {

    @Test
    public void testeFiltrarMulheres(){
        ListaPessoas listaPessoas = new ListaPessoas();
        List<String> pessoas = List.of("Ana-F","Carlos-M", "Maria-F", "José-M", "Paula-F");
        List<String> mulheres = listaPessoas.filtrarMulheres(pessoas);

        assertEquals(3, mulheres.size());
        assertTrue(mulheres.contains("Ana-F"));
        assertTrue(mulheres.contains("Maria-F"));
        assertTrue(mulheres.contains("Paula-F"));

        assertFalse(mulheres.contains("Carlos-M"));
        assertFalse(mulheres.contains("José-M"));
    }
}