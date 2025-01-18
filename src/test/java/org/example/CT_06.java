package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CT_06 {
    @Test
    void zerarValor() {
        Contador contador = new Contador(5);
        contador.zerar();
        assertEquals(0, contador.getValor());
    }
}


//public void zerar() {
//    this.valor = 0;
//}