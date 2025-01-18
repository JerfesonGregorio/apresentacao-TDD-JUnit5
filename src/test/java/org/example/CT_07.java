package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CT_07 {
    @ParameterizedTest
    @ValueSource(ints = { 1, 5, 10 })
    void iniciarComValoresDiversos(int valorInicial) {
        Contador contadorParametrizado = new Contador(valorInicial);
        System.out.println("Iniciando um contador com valor " + valorInicial);
        System.out.println("Valor apresentado: " + contadorParametrizado.getValor());
        assertEquals(valorInicial, contadorParametrizado.getValor());

    }
}
