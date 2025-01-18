package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CT_03 {
    @Test
    void incrementarValor() {
        Contador contador = new Contador(5);
        contador.incrementar();
        assertEquals(6, contador.getValor());
    }

}

//public void incrementar() {
//    valor++;
//}
