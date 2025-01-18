package org.example;

public class Contador {
    private int valor;

    public Contador(int valorInicial) {
        if (valorInicial < 0) {
            throw new IllegalArgumentException("O valor inicial não pode ser negativo");
        }
        this.valor = valorInicial;
    }

    public int getValor() {
        return valor;
    }

    public void incrementar() {
        valor++;
    }

    public void decrementar() {
        if (valor <= 0) {
            throw new IllegalStateException("Não é possível decrementar um contador menor ou igual a 0");
        }
        valor--;
    }

    public void zerar() {
        this.valor = 0;
    }
}