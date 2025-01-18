package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ContadorTest {

    @BeforeAll
    static void setupAll() {
        System.out.println("Executando antes de todos os testes");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Executando depois de todos os testes");
    }

    @BeforeEach
    void setup() {
        System.out.println("Executando antes de cada teste");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Executando depois de cada teste");
    }

    @Test
    void iniciarComValorPositivo() {
        Contador contador = new Contador(5);
        assertEquals(5, contador.getValor());
    }

    @Test
    void iniciarComValorNegativo_deveLancarException() {
        assertThrows(IllegalArgumentException.class, () -> new Contador(-10));
    }

    @Test
    void incrementarValor() {
        Contador contador = new Contador(5);
        contador.incrementar();
        assertEquals(6, contador.getValor());
    }

    @Test
    void decrementarValor() {
        Contador contador = new Contador(5);
        contador.decrementar();
        assertEquals(4, contador.getValor());
    }

    @Test
    void decrementarComValorZero_deveLancarException() {
        Contador contadorZero = new Contador(0);
        assertThrows(IllegalStateException.class, () -> contadorZero.decrementar());
    }

    @Test
    void zerarValor() {
        Contador contador = new Contador(5);
        contador.zerar();
        assertEquals(0, contador.getValor());
    }

    @ParameterizedTest
    @ValueSource(ints = { 1, 5, 10 })
    void iniciarComValoresDiversos(int valorInicial) {
        Contador contadorParametrizado = new Contador(valorInicial);
        assertEquals(valorInicial, contadorParametrizado.getValor());
    }
}