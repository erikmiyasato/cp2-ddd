package br.com.fiap.enums;

public enum Quantidade {
    UM(1), DOIS(2), TRES(3), QUATRO(4), CINCO(5),
    SEIS(6), SETE(7), OITO(8), NOVE(9), DEZ(10);

    private final int valor;

    Quantidade(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}