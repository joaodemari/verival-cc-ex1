import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.LinkedList;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkedListTest {


    @Test
    public void removerObjetoInteiro() {

        LinkedList<Object> lista = new LinkedList<>();
        lista.add("GEBENEUSA");
        lista.add(null);
        lista.add(6);

        lista.add(9);

        assertTrue(lista.remove((Object)6));
    }

    @Test
    public void removerObjetoNulo() {

        LinkedList<Object> lista = new LinkedList<>();
        lista.add("GEBENEUSA");
        lista.add(null);
        lista.add(6);
        lista.add(9);

        assertTrue(lista.remove(null));
    }


    @Test
    public void removerObjetoNãoExistente() {

        LinkedList<Object> lista = new LinkedList<>();
        lista.add("GEBENEUSA");
        lista.add(null);
        lista.add(6);
        lista.add(9);

        assertFalse(lista.remove((Object)8));
    }
}