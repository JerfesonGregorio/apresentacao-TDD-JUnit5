package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CT_02 {
    @Test
    void iniciarComValorNegativo_deveLancarException() {
        assertThrows(IllegalArgumentException.class, () -> new Contador(-10));
    }
}

//public Contador(int valorInicial) {
//    if (valorInicial < 0) {
//        throw new IllegalArgumentException("O valor inicial não pode ser negativo");
//    }
//    this.valor = valorInicial;
//}