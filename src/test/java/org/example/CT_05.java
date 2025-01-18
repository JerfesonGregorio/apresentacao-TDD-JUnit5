package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CT_05 {
    @Test
    void decrementarComValorZero_deveLancarException() {
        Contador contadorZero = new Contador(0);
        assertThrows(IllegalStateException.class, () -> contadorZero.decrementar());
    }
}

//public void decrementar() {
//    if (valor <= 0) {
//        throw new IllegalStateException("Não é possível decrementar um contador menor ou igual a 0");
//    }
//    valor--;
//}
