package org.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CT_01 {

    @Test
    void iniciarComValorPositivo() {
        Contador contador = new Contador(5);
        assertEquals(5, contador.getValor());
    }

}

//public class Contador {
//    private int valor;
//
//    public Contador(int valorInicial) {
//
//        this.valor = valorInicial;
//    }
//
//    public int getValor() {
//        return valor;
//    }
//
//    // ... Outros métodos ...
//}
