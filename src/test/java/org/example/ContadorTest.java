package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ContadorTest {

    private Contador contador;

    @BeforeAll
    static void setupAll() {
        System.out.println("Iniciando os testes da classe Contador");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Finalizando os testes da classe Contador");
    }

    @BeforeEach
    void setup() {
        System.out.println("Inicializando um novo contador");
        contador = new Contador(5);
    }

    @AfterEach
    void tearDown() {
        System.out.println("Finalizando um teste do contador");
    }

    @Test
    void iniciarComValorPositivo() {
        assertEquals(5, contador.getValor());
    }

    @Test
    void iniciarComValorNegativo_deveLancarException() {
        assertThrows(IllegalArgumentException.class, () -> new Contador(-10));
    }

    @Test
    void incrementarValor() {
        contador.incrementar();
        assertEquals(6, contador.getValor());
    }

    @Test
    void decrementarValor() {
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
        contador.zerar();
        assertEquals(0, contador.getValor());
    }

    @ParameterizedTest
    @ValueSource(ints = { 1, 5, 10})
    void iniciarComValoresDiversos(int valorInicial) {
        Contador contadorParametrizado = new Contador(valorInicial);
        assertEquals(valorInicial, contadorParametrizado.getValor());

    }
}