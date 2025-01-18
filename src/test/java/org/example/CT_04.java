package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CT_04 {
    @Test
    void decrementarValor() {
        Contador contador = new Contador(5);
        contador.decrementar();
        assertEquals(4, contador.getValor());
    }
}

//public void decrementar() {
//    valor--;
//}